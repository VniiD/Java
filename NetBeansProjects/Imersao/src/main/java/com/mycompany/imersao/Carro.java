package com.mycompany.imersao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Carro {
    private int id;
    private String modelo;
    private double quilometragem;
    private double valorVenda;
    
    public void cadastrarCarro() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog(message:"Digite o código do carro"));
        this.modelo = JOptionPane.showInputDialog(message:"Digite o modelo do carro");
        this.quilometragem = Double.parseDouble(JOptionPane.showInputDialog(message:"Digite a quilometragem do carro"));
        this.valorVenda = Double.parseDouble(JOptionPane.showInputDialog(message:"Digite o valor de venda do carro"));
    }
    
    public String imprimirResumoCarro(){
        String msg = "Id: " + this.id + "\n" + "Modelo: " + this.modelo + "\n";
        msg = "Quilometragem: " + this.quilometragem + "\n" + 
              "Valor Venda: " + this.valorVenda;
        return msg;
    }
    
    public void atualizarValordesconto(double percentualDesconto){
        this.valorVenda *= (percentualDesconto / 100);
    }
    
    public double getValorVenda() {
        return this.valorVenda;
    }
}