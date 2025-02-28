package com.mycompany.aeroporto;

public class Voo {
    private String codigo;
    private int totalAssentos; 
    private int assentosOcupados;
    private Aeroporto origem;
    private Aeroporto destino;

    public Voo(String codigo, int totalAssentos, Aeroporto origem, Aeroporto destino) {
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
        this.origem = origem;
        this.destino = destino;
    }

    public void reservaAssentos() {
        if (assentosOcupados < totalAssentos) {
            assentosOcupados++;
        } else {
            System.out.println("Não há assentos disponíveis para reserva.");
        }
    }

    public int getAssentosDisponiveis() {
        return totalAssentos - assentosOcupados; // Corrigido
    }

    public String getCodigo() {
        return codigo;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }
}