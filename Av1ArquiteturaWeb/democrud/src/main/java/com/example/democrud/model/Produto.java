package com.example.democrud.model;

import org.springframework.boot.autoconfigure.domain.EntityScan; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor; 
import lombok.Data; // Gera automaticamente getters, setters, equals, hashCode e toString.

@EntityScan("com.example.democrud.model")
@Entity
@Data
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    private String name; 
    private Double preco;
    private String description; 

    public Produto() {
    }
    
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}



