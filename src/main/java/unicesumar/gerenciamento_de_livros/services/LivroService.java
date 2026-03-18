package unicesumar.gerenciamento_de_livros.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.gerenciamento_de_livros.models.LivroModel;
import unicesumar.gerenciamento_de_livros.repositories.LivroRepository;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel) {
        return livroRepository.save(livroModel);
    }

    public List<LivroModel> listarLivros() {
        return livroRepository.findAll();
    }

    public LivroModel buscarLivroPorId(Long id) {
        return livroRepository.findById(id).get();
    }

    public void deletarLivroPorId(Long id) {
        livroRepository.deleteById(id);
    }

}
