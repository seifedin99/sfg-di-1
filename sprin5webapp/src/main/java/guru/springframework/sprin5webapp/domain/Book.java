package guru.springframework.sprin5webapp.domain;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity

public class Book {
     @Id

     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
     private String tittle;
     private String isbn;
     @ManyToOne
     private Publisher publisher;

     @ManyToMany
     @JoinTable(name="author_book",joinColumns = @JoinColumn(name = "book_id")
             ,inverseJoinColumns = @JoinColumn(name =  "author_id"))
     private Set<Author>authors=new HashSet<>();

     public Book() {
     }

     public Book(String tittle, String isbn) {
          this.tittle = tittle;
          this.isbn = isbn;
     }


     public String getTittle() {
          return tittle;
     }

     public void setTittle(String tittle) {
          this.tittle = tittle;
     }

     public String getIsbn() {
          return isbn;
     }

     public void setIsbn(String isbn) {
          this.isbn = isbn;
     }

     public Set<Author> getAuthor() {
          return authors;
     }

     public void setAuthor(Set<Author> author) {
          this.authors = authors;
     }

     public Set<Author> getAuthors() {
          return authors;
     }

     public void setAuthors(Set<Author> authors) {
          this.authors = authors;
     }

     public Publisher getPublisher() {
          return publisher;
     }

     public void setPublisher(Publisher publisher) {
          this.publisher = publisher;
     }

     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Book book = (Book) o;
          return id == book.id;
     }

     @Override
     public String toString() {
          return "Book{" +
                  "id=" + id +
                  ", tittle='" + tittle + '\'' +
                  ", isbn='" + isbn + '\'' +
                  ", authors=" + authors +
                  '}';
     }

     @Override
     public int hashCode() {
          return Objects.hash(id);
     }
}
