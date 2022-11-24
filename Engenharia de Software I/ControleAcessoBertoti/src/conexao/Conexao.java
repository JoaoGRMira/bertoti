/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joaog
 */
public class Conexao {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/bancobertoti?serverTimezone=UTC","root","fatec");          
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}
