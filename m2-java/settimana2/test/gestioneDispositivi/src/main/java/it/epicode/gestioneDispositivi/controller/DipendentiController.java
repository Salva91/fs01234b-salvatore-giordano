package it.epicode.gestioneDispositivi.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.common.util.StringUtils;
import it.epicode.gestioneDispositivi.entities.Dipendente;
import it.epicode.gestioneDispositivi.services.DipendenteService;
import jakarta.persistence.criteria.Path;

@RestController
@RequestMapping("/dipendenti")
public class DipendentiController {

    @Autowired
    private DipendenteService dipendenteService;

    private static final String UPLOAD_DIR = "pictures";

    @PostMapping
    public Dipendente createDipendente(@RequestBody Dipendente dipendente) {
        return dipendenteService.save(dipendente);
    }

    @GetMapping
    public List<Dipendente> getAllDipendenti(@RequestParam int page, @RequestParam int size, @RequestParam String sort) {
        return dipendenteService.getDipendenti(page, size, sort).getContent();
    }

    @GetMapping("/{id}")
    public Dipendente getDipendenteById(@PathVariable Long id) {
        return dipendenteService.findById(id);
    }

    @PutMapping("/{id}")
    public Dipendente updateDipendente(@PathVariable Long id, @RequestBody Dipendente dipendente) {
        return dipendenteService.findByIdAndUpdate(id, dipendente);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDipendente(@PathVariable Long id) {
        dipendenteService.findByIdAndDelete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/uploadProfileImage")
    public ResponseEntity<String> uploadProfileImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("File non caricato");
        }

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            String directory = System.getProperty("user.dir");
            java.nio.file.Path uploadPath = Paths.get(directory, UPLOAD_DIR);

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            java.nio.file.Path filePath = uploadPath.resolve(fileName);
            Files.write(filePath, file.getBytes());

            Dipendente dipendente = dipendenteService.findById(id);
            String imagePath = UPLOAD_DIR + "/" + fileName;
            dipendente.setPathImmagine(imagePath);
            dipendenteService.save(dipendente);
            
            return ResponseEntity.ok("File caricato");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("File non caricato");
        }
    }
}
