/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author v
 */
public class PrincipalVeiculo {
    
    public static void main (String args[]){
       
        //Veiculo veiculo = new Carro();
        
        Carro carro= new Carro();
        
        carro.numeroDePortas = 4;
        
        System.out.println(carro+" Portas");
        
        //estacionarVeiculo(veiculo);
    }
    
    public static void estacionarVeiculo(Veiculo veiculo){
        
        if(veiculo instanceof Carro){
            System.out.println("Iniciando a baliza do carro");
        }else {
            System.out.println("Iniciando a manobra de entrada no hangar ");
        }
        
        veiculo.andarFrente();
        veiculo.andarFrente();
        veiculo.buzinar();
        System.out.println("finalizando o estacionamento");
    }
    
}
