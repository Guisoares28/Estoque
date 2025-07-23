/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gui.estoque.util;

import com.gui.estoque.model.FornecedorModel;

/**
 *
 * @author Guilherme
 */
public class FornecedorUtil {

    public static FornecedorModel criarFornecedorModel(String cnpj, String nome, String telefone){
        FornecedorModel fornecedor = new FornecedorModel();
        
        fornecedor.setCnpj(cnpj);
        fornecedor.setNome(nome);
        fornecedor.setTelefone(telefone);
        
        return fornecedor;
    }

    
}
