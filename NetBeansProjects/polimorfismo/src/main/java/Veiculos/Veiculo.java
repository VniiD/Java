/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;     

/**
 *
 * @author v
 */
public abstract class Veiculo {                //tranformando a classe em abstrata
    private int ano;
    
    public abstract void andarFrente();
    
    public void buzinar(){
        System.out.println("Emitindo som de alerta!");
    }
}