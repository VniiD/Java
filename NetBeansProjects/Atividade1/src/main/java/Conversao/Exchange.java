/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversao;

/**
 *
 * @author v
 */
public class Exchange{
    
    private final double cotacaoDolar  = 5.5;         // US$ 5,50
    private final double iof           = 0.0586;      //  R$ 0,05
    private final double spreadCambial = 0.01;        //%

    public double comprarDolar(Double valorReal){
        
        double valorBruto        = valorReal / cotacaoDolar;
        
        double valorIof          = valorBruto - (valorBruto * iof);
        double valorSpread       = valorBruto - (valorBruto * spreadCambial);
        
        double valorTotalDolar   = (valorIof + valorSpread) - valorBruto;
        
        return valorTotalDolar;
    }
        
    public static void main(String[] args){
        
        Exchange exchange   = new Exchange();
        double valorReal    = 1000;
        double valorDolar   = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}
