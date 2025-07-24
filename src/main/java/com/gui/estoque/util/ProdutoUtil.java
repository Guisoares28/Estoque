/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gui.estoque.util;

import com.gui.estoque.dao.CategoriaDAO;
import com.gui.estoque.dao.FornecedorDAO;
import com.gui.estoque.model.CategoriaModel;
import com.gui.estoque.model.FornecedorModel;
import com.gui.estoque.model.ProdutoModel;
import java.math.BigDecimal;
import java.sql.SQLException;

/**
 *
 * @author Guilherme
 * 
 */
public class ProdutoUtil {
    
    public static ProdutoModel criarProdutoModel(String descricao, String valorCompra,
            String valorVenda, String quantidade, String fornecedorNome, String categoriaNome) throws SQLException{
        
        ProdutoModel produto = new ProdutoModel();
        FornecedorModel fornecedor = FornecedorDAO.buscarFornecedorPorNome(fornecedorNome);
        CategoriaModel categoria = CategoriaDAO.buscarCategoria(categoriaNome);
        
        produto.setDescricao(descricao);
        produto.setValor_compra(new BigDecimal(valorCompra));
        produto.setValor_venda(new BigDecimal(valorVenda));
        produto.setQuantidade(Integer.valueOf(quantidade));
        produto.setFornecedor_id(fornecedor.getId());
        produto.setCategoria_id(categoria.getId());
        
        return produto;
    }
    
}
