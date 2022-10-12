/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *Sistema de Controle de Acesso
 * @author João Gabriel
 */
public class Cadastrar extends Usuario {
        protected boolean cadastro;

    public Cadastrar(boolean cadastro, String nome, int rg, int sala) {
        super(nome, rg, sala);
        this.cadastro = cadastro;
    }

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }
    
    public void imprimir()
    {
        System.out.println("Nome: " +nome);
        System.out.println("RG: " +rg);
        System.out.println("Sala: " +sala);
        System.out.println("Cadastro: " +cadastro);
    }
        
    public void acesso()
    {
        if (cadastro == true)
            System.out.println("Acesso liberado. \n");
        else
            System.out.println("Acesso negado. \n");
    }
    
}
