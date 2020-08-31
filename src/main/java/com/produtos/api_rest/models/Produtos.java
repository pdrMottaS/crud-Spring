package com.produtos.api_rest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produtos implements Serializable {
    private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private BigDecimal qtd;
    private BigDecimal valor;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public BigDecimal getQtd(){
        return qtd;
    }

    public void setQtd(BigDecimal qtd){
        this.qtd=qtd;
    }

    public BigDecimal getValor(){
        return valor;
    }

    public void setValor(BigDecimal valor){
        this.valor=valor;
    }
}