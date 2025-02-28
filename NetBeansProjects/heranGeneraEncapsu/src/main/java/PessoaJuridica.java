/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    
    /*      POJOS     JAVABEANS     */
    public void setCnpj(String cnpj){
        this.cnpj = cnpj; 
    }
    public String getCnpj(){
        return this.cnpj;
    }
    /*                              */
}
