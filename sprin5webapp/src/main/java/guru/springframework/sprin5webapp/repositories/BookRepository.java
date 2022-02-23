package guru.springframework.sprin5webapp.repositories;

import guru.springframework.sprin5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Long>{
}
