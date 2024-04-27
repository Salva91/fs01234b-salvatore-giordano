package biblioteca;

import java.util.List;

public class Main {

	public static void main(String[] args) {
	      FileLibraryService biblioteca = new FileLibraryService();


	        biblioteca.addPublication(new Book(134556789L, "Il sapere delle cose", 980, 350, "Johanna Monti", "Linguistica"));
	        biblioteca.addPublication(new Magazine(987654321L, "Il tuo Idropene e altri modi per divertirsi", 2024, 69, Frequency.SEMI_ANNUAL));
	        biblioteca.addPublication(new Book(66577438L, "gino fastidio", 450, 280, "Boh", "risate"));
	        biblioteca.addPublication(new Book(6657759L, "Mustafa", 400, 999, "Ali", "Fiabe"));
	        biblioteca.saveLibrary();


	        Long ISBNToSearch = 987654321L;
	        int yearToSearch = 1314;
	        String authorToSearch = "Dante Alighieri";

	        List<Publication> ISBNTrovato = biblioteca.findByISBN(ISBNToSearch);
	        List<Publication> annoTrovato = biblioteca.findByPublicationYear(yearToSearch);
	        List<Publication> autoreTrovato = biblioteca.findByAuthor(authorToSearch);

	
	        biblioteca.removePublicationByISBN(ISBNToSearch);

	    
	        ISBNTrovato.forEach(p -> System.out.println("L'articolo con ISBN " + ISBNToSearch + " è '" + p.getTitle() + "'"));
	        System.out.format("%nTrovati " + annoTrovato.size() + " articoli pubblicati nel " + yearToSearch + ":%n");
	        annoTrovato.forEach(p -> System.out.println("-" + p.getPublicationYear()));


	        System.out.format("%nLibri trovati dell'autore " + authorToSearch + ":%n");
	        autoreTrovato.forEach(p -> System.out.println("-" + p.getTitle()));

	    }

	}



