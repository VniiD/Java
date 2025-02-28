package com.mycompany.imersao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cliente {
    
    private int id;
    private String nome;
    private int idade;
    private double renda;
    
    public void cadastrarCliente(){
        this.id = Integer.parseInt(JOptionPane.showInputDialog(message:"Digite o código do cliente"));
        this.nome = JOptionPane.showInputDialog(message:"Digite o nome do cliente");
         boolean idadeValida = false;
        while (!idadeValida) {
            this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do cliente"));
            if (this.idade > 18) {
                idadeValida = true; // Idade válida, prosseguir
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro não permitido. Cliente deve ter idade superior a 18 anos.");
            }
        return ;
        }
        this.renda = Double.parseDouble(JOptionPane.showInputDialog(message:"Digite a renda do cliente"));
    }
    
    public String imprimirResumoCliente(){
        String msg = "Id" + this.id + "\n";
        msg += "Nome: " + this.nome + "\n";
        msg += "Idade: " + this.idade + "\n";
        msg += "Renda: " + this.renda;
        return msg;
    }
    
    public double getRenda() {
        return this.renda;
    }
}