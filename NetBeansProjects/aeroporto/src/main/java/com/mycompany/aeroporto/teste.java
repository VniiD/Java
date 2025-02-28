/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

/**
 *
 * @author v
 */
public class Main {
    public static void main(String[] args) {
        Aeroporto origem = new Aeroporto("Aeroporto Internacional", "GRU");
        Aeroporto destino = new Aeroporto("Aeroporto Nacional", "GIG");
        
        Voo voo = new Voo("V001", 100, origem, destino);
        CompanhiaAerea companhia = new CompanhiaAerea("Companhia Aérea Exemplo");

        // Adicionando voo à companhia
        companhia.adicionarVoo(voo);
        
        // Reservando assentos
        for (int i = 0; i < 105; i++) { // Tentativa de reservar 105 assentos
            voo.reservaAssentos();
        }

        // Verificando assentos disponíveis
        System.out.println("Assentos disponíveis: " + voo.getAssentosDisponiveis());

        // Criando passagem
        Passagem passagem = new Passagem(voo, "João da Silva", 200.0);
        System.out.println("Preço total da passagem: R$" + passagem.calcularPrecoTotal());
    }
}
