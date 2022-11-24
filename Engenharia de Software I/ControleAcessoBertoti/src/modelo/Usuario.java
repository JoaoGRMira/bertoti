/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaog
 */
public class Usuario {
    
    private int id;
    private String nome;
    private String rg;
    private String sala;
    private String biometria;

    public Usuario(int id, String nome, String rg, String sala, String biometria) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.sala = sala;
        this.biometria = biometria;
    }

    public Usuario() { 
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getSala() {
        return sala;
    }

    public String getBiometria() {
        return biometria;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setBiometria(String biometria) {
        this.biometria = biometria;
    }
    
}
