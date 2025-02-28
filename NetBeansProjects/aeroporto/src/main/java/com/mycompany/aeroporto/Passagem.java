package com.mycompany.aeroporto;

public class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private double preco;

    public Passagem(Voo voo, String nomePassageiro, double preco) {
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
    }

    public double calcularPrecoTotal() {
        return preco + 10.0; // Taxa de embarque corrigida
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public InstrumentoMusical() { 
    }
}