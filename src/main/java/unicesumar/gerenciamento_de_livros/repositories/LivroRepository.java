package unicesumar.gerenciamento_de_livros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.gerenciamento_de_livros.models.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}
