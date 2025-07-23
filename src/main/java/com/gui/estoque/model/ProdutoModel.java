/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gui.estoque.model;

import java.math.BigDecimal;

/**
 *
 * @author Guilherme
 */
public class ProdutoModel {
    
    private Integer id;
    
    private String descricao;
    
    private BigDecimal valor_compra;
    
    private BigDecimal valor_venda;
    
    private Integer quantidade;
    
    private Integer fornecedor_id;
    
    private Integer categoria_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(BigDecimal valor_compra) {
        this.valor_compra = valor_compra;
    }

    public BigDecimal getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(BigDecimal valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getFornecedor_id() {
        return fornecedor_id;
    }

    public void setFornecedor_id(Integer fornecedor_id) {
        this.fornecedor_id = fornecedor_id;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }
    
    
    
    
}
