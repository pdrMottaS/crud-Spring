package com.produtos.api_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.produtos.api_rest.repository.ProdutosRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.produtos.api_rest.models.Produtos;

@RestController
@RequestMapping(value = "/produto")
public class ProdutosController {
    @Autowired
    ProdutosRepository produtosRepository;

    @GetMapping("/index")
    public List<Produtos> indexProdutos(){
        return produtosRepository.findAll();
    }

    @GetMapping("/profile/{id}")
    public Produtos profileProduto(@PathVariable(value = "id") long id){
        return produtosRepository.findById(id);
    }

    @PostMapping("/create")
    public Produtos createProduto(@RequestBody Produtos produto){
        return produtosRepository.save(produto);
    }

    @DeleteMapping("/delete/{id}")
    public Map<String,String> deleteProduto(@PathVariable(value = "id") long id){
        produtosRepository.deleteById(id);
        HashMap<String,String> res = new HashMap<>();
        res.put("msg","Produto Deleteado");
        return res;
    }

    @PutMapping("/update")
    public Produtos updateProduto(@RequestBody Produtos produto){
        return produtosRepository.save(produto);
    }

    @GetMapping("/search/{nome}")
    public List<Produtos> searchProduto(@PathVariable(value = "nome") String nome){
        return produtosRepository.findBySearch(nome);
    }
}