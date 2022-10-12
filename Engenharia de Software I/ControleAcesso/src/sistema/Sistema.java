/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

/**
 *Sistema de Controle de Acesso
 * @author João Gabriel
 */
public class Sistema {
    public static void main(String[] args) {
        Cadastrar entrada;
        
        entrada = new Cadastrar(true, "João", 999999999, 3);
        entrada.imprimir();
        entrada.acesso();
        
        entrada = new Cadastrar(false, "Rodrigo", 999999999, 7);
        entrada.imprimir();
        entrada.acesso();
    }
    
}
