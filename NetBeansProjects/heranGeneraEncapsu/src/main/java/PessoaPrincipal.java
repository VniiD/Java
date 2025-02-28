/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v
 */
public class PessoaPrincipal {
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa();
        
        pessoa.nomePessoa = "João";
        pessoa.telefone = "(11) 96548-9872";
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        
        pessoaFisica.setCpf("321.654.987-98");
        pessoaFisica.setNomePessoa("nome herdado");
        
        System.out.println(pessoa);

    }
}
