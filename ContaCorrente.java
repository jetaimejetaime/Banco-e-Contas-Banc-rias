package com.exemplo.banco;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numero, double taxaManutencao) {
        super(numero);
        this.taxaManutencao = taxaManutencao;
    }

    public void aplicarTaxa() {
        saldo -= taxaManutencao;
        System.out.println("Taxa de manutenção de R$" + taxaManutencao + " aplicada. Saldo atual: R$" + saldo);
    }
}

