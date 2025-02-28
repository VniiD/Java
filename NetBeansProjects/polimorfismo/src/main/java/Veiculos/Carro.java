/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author v
 */
public class Carro extends Veiculo {
    
    protected int numeroDePortas;
    
    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }
    public int getNumeroDePortas(){
        return this.numeroDePortas;
    }
    
    @Override
    public void andarFrente(){
        System.out.println("Acelerando trocando de marcha, fazendo o carro andar");
    }
    
    @Override
    public String toString(){                    //retorna o valor da aplicação literal
        return "Carro de "+numeroDePortas;
    }
    
                                                   //equal faz o comparativo e reotrna os valores literais
    
}
