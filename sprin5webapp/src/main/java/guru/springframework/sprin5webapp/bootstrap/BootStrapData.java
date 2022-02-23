package guru.springframework.sprin5webapp.bootstrap;
import guru.springframework.sprin5webapp.domain.Author;
import guru.springframework.sprin5webapp.domain.Book;
import guru.springframework.sprin5webapp.domain.Publisher;
import guru.springframework.sprin5webapp.repositories.AuthorRepository;
import guru.springframework.sprin5webapp.repositories.BookRepository;
import guru.springframework.sprin5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Author eric = new Author("Eric", "evans");
        Book ddd = new Book("domain driven design", "987789");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);
        //authorRepository.save(eric);
        //bookRepository.save(ddd);

        Author rod = new Author("Rod", "johanson");
        Book noEJB = new Book("J2EE", "987789");
        rod.getBooks().add(noEJB);
        noEJB.getAuthor().add(rod);

        //  authorRepository.save(rod);
        //  bookRepository.save(noEJB);

        //System.out.println("Number of Authors:" +authorRepository.count());
         // System.out.println("Number of books:" +bookRepository.count());

        Publisher a1 =new Publisher();
        a1.setName("anderson");
        a1.setCity("dallas");
        a1.setState("tx");
        a1.setAdressLine(" 9221 amberton parkway");
        a1.setZip("75243");

        publisherRepository.save(a1);
        System.out.println("number of publisher:"  + publisherRepository.count());
        ddd.setPublisher(a1);
        noEJB.setPublisher(a1);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Number of Authors:" +authorRepository.count());
        System.out.println("Number of books:" +bookRepository.count());
    }
}