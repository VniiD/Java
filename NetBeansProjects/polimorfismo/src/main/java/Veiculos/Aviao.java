/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author v
 */
public class Aviao extends Veiculo implements Voo {
    
    @Override
    public void voar(){
        System.out.println("Voando como um avião!");
    }
    
    @Override
    public void andarFrente(){
        System.out.println("Decolando e atingindo velocidade de cruzeiro, seguindo a rota estipulada");
    }
}
