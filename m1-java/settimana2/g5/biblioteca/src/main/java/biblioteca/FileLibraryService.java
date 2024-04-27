package biblioteca;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileLibraryService {

    private static final Logger logger = LoggerFactory.getLogger(FileLibraryService.class);
    private static final String STORAGE_FILE_PATH = "./library.csv";

    private final ArrayList <Publication> library = new ArrayList<>();

    public FileLibraryService() {
        loadLibrary();
    }

    public void addPublication(Publication publication) {
        library.add(publication);
    }

    public void removePublicationByISBN(Long ISBN) {
        library.removeIf(p -> p.getISBN().equals(ISBN));
    }

    public List<Publication> findByISBN(Long ISBN) {
        return library.stream()
                .filter(p -> p.getISBN().equals(ISBN))
                .collect(Collectors.toList());
    }

    public List<Publication> findByPublicationYear(int publicationYear) {
        return library.stream()
                .filter(p -> p.getPublicationYear() == publicationYear)
                .collect(Collectors.toList());
    }

    public List<Publication> findByAuthor(String author) {
        return library.stream()
                .filter(p -> p instanceof Book && ((Book) p).getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Publication> getAllPublications() {
        return new ArrayList<>(library);
    }

    public void saveLibrary() {
        File file = new File(STORAGE_FILE_PATH);
        try {
            FileUtils.write(file, "", StandardCharsets.ISO_8859_1);
            for (Publication p : library) {
                List<String> lines = new ArrayList<>();
                lines.add(p.getClass().getSimpleName());
                lines.add(p.getISBN().toString());
                lines.add(p.getTitle());
                lines.add(String.valueOf(p.getPublicationYear()));
                lines.add(String.valueOf(p.getNumPages()));
                if (p instanceof Book) {
                    Book l = (Book) p;
                    lines.add(l.getAuthor());
                    lines.add(l.getGenre());
                } else if (p instanceof Magazine) {
                    Magazine r = (Magazine) p;
                    lines.add(r.getFrequency().toString());
                }
                FileUtils.writeStringToFile(file, String.join(",", lines) + System.lineSeparator(), StandardCharsets.ISO_8859_1, true);
            }
        } catch (IOException e) {
            logger.error("Exception during saving", e);
        }
    }

    private void loadLibrary() {
        File file = new File(STORAGE_FILE_PATH);
        if (!file.exists()) return;
        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.ISO_8859_1);
            for (String line : lines) {
                String[] parts = line.split(",");
                Long ISBN = Long.parseLong(parts[1]);
                String titolo = parts[2];
                int annoPubblicazione = Integer.parseInt(parts[3]);
                int numeroPagine = Integer.parseInt(parts[4]);
                if ("Libro".equals(parts[0])) {
                    String autore = parts[5];
                    String genere = parts[6];
                    library.add(new Book(ISBN, titolo, annoPubblicazione, numeroPagine, autore, genere));
                } else if ("Rivista".equals(parts[0])) {
                    Frequency frequenza = Frequency.valueOf(parts[5]);

                    library.add(new Magazine(ISBN, titolo, annoPubblicazione, numeroPagine, frequenza));
                }
            }
        } catch (IOException e) {
            logger.error("Exception during loading", e);
        }
    }
}
