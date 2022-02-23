package guru.springframework.sprin5webapp.repositories;

import guru.springframework.sprin5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
