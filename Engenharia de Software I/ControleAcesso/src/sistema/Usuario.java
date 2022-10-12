/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *Sistema de Controle de Acesso
 * @author João Gabriel
 */
public class Usuario {
    protected String nome;
    protected int rg;
    protected int sala;

    public Usuario(String nome, int rg, int sala) {
        this.nome = nome;
        this.rg = rg;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public int getRg() {
        return rg;
    }

    public int getSala() {
        return sala;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
}
