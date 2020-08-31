package com.produtos.api_rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.produtos.api_rest.models.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos,Long>{
    Produtos  findById(long id);   
}