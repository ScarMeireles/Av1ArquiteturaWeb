
package com.example.democrud.repository;


import org.springframework.data.jpa.repository.JpaRepository; 


import org.springframework.stereotype.Repository;


import com.example.democrud.model.Produto;


@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
