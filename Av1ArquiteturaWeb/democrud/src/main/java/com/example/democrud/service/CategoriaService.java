package com.example.democrud.service; 

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.democrud.model.Categoria;
import com.example.democrud.repository.CategoriaRepository;
// Importa a classe Produto e o repositório CategoriaRepository para operações no banco de dados.

@Service 
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository; 
    public List<Categoria> findAll() {
        return categoriaRepository.findAll(); 
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id); 
    }

    public Categoria save(Categoria model) {
        return categoriaRepository.save(model); 
    }

    public boolean deleteById(Long id) {
        if (categoriaRepository.existsById(id)) { 
            categoriaRepository.deleteById(id); 
            return true; 
        }
        return false; 
    }

    public Optional<Categoria> update(Long id, Categoria updatedModel) {
        return categoriaRepository.findById(id).map(existingModel -> { 
            existingModel.setName(updatedModel.getName()); 
            existingModel.setDescription(updatedModel.getDescription()); 
            return categoriaRepository.save(existingModel); 
        });
    }
}
