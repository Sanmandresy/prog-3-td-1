package app.prog.repository;

import app.prog.model.AuthorEntity;
import app.prog.model.BookEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
  Optional<AuthorEntity> findByName(String name);
}
