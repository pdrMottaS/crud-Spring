package com.produtos.api_rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.produtos.api_rest.models.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos,Long>{

    Produtos  findById(long id);
    
    @Query(value = "SELECT * FROM produtos p WHERE LOWER(p.nome) LIKE LOWER(CONCAT('%',:nome,'%'))", nativeQuery = true)
    List<Produtos> findBySearch(@Param("nome") String nome);

}