/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author joaog
 */
public class UsuarioDAO {
    private Connection connection;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int st;
    
    public UsuarioDAO(){
        this.connection = new Conexao().getConnection();
    }
    public void adicionaUsuario(Usuario usuario){
        String sql = "INSERT INTO usuario(id_usuario, nome, rg, sala, biometria) VALUES(?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, usuario.getId());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getRg());
            stmt.setString(4, usuario.getSala());
            stmt.setString(5, usuario.getBiometria());
            stmt.execute();
        }
        catch (SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public boolean checkLogin(String nome, String rg){
       
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean checagem = false;
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM usuario WHERE nome = ? and rg = ?");
            stmt.setString(1, nome);
            stmt.setString(2, rg);
            rs = stmt.executeQuery();
           
            if (rs.next()){
                checagem = true;
            }
           
        }catch(SQLException ex){
            System.out.println("Algo ocorreu errado, tente novamente !");
        }finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Algo ocorreu errado, tente novamente !");
            }
        }
        return checagem;
    }
}
