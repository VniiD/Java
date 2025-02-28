/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v
 */
public class Pessoa {
    protected String nomePessoa;
    protected String telefone;
    
    /*      POJOS     JAVABEANS     */
    
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa; 
    }
    public String getNomePessoa(){
        return this.nomePessoa;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone; 
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    /*                              */
}
