package com.example.demo.model;

public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    VENDAS("Vendas");

    private String menusculo;

    Setor(String menusculo) {
        this.menusculo = menusculo;
    }

    public String getMenusculo() {
        return menusculo;
    }
}
