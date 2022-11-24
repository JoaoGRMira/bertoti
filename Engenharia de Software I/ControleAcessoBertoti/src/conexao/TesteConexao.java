/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author joaog
 */
public class TesteConexao {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Connection conexaobanco = new Conexao().getConnection();
        System.out.println("Conexão Aberta !");
        conexaobanco.close();
    }
    
}
