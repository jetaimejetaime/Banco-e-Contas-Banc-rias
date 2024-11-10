package com.exemplo.banco;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, double taxaJuros) {
        super(numero);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * (taxaJuros / 100);
        System.out.println("Juros aplicados. Saldo atual: R$" + saldo);
    }
}
