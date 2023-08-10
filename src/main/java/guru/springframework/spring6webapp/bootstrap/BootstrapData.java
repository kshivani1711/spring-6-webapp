package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Book ddd = Book.builder().title("Domain Driven Design").isbn("1234").build();
        Book noEjb = Book.builder().title("J2ee without EJB").isbn("56").build();
        //books saved without author
        Book dddSaved = bookRepository.save(ddd);
        Book noEjbSaved = bookRepository.save(noEjb);

        Author eric = Author.builder().firstName("Eric").lastName("Evans").build();
        Author rod = Author.builder().firstName("Rod").lastName("Johnson").build();
        eric.getBooks().add(dddSaved);
        rod.getBooks().add(noEjbSaved);

        //Authors saved with books data.
        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

        //now set the authors to books
        dddSaved.getAuthors().add(ericSaved);
        noEjbSaved.getAuthors().add(rodSaved);

        Publisher p1 = Publisher.builder().publisherName("Publisher 1").address("Address 1").city("city 1").state("State 1")
                .zipCode("123")
                .build();
        p1.getBooks().add(dddSaved);
        p1.getBooks().add(dddSaved);
        Publisher p1Saved = publisherRepository.save(p1);
        dddSaved.setPublisher(p1Saved);
        noEjbSaved.setPublisher(p1Saved);

        bookRepository.save(dddSaved);
        bookRepository.save(noEjbSaved);


    }

}
