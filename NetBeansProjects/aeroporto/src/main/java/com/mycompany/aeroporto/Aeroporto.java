package com.mycompany.aeroporto;

public class Aeroporto {
    private String nome;
    private String codigo; // Ex: GRU, GIG

    public Aeroporto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}