package com.gui.estoque.util;

import com.gui.estoque.dao.CategoriaDAO;
import com.gui.estoque.dao.FornecedorDAO;
import com.gui.estoque.dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilherme
 */
public class ConnectionFactory {
    
    private static final String url = "jdbc:h2:file:./banco/estoque";
    
    private static final String usuario = "sa";
    
    private static final String password = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, usuario, password);
    }
    
    public static void criarTodasTabelas() throws SQLException{
        CategoriaDAO.criarTabelaCategoria();
        FornecedorDAO.criarTabelaFornecedor();
        ProdutoDAO.criarTabelaProduto();
        System.out.println("Tabelas criadas com sucesso.");
    }
    
}
