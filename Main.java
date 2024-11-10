package com.exemplo.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("12345", 10.0);
        ContaPoupanca cp = new ContaPoupanca("54321", 2.0);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(500);
        cc.sacar(100);
        cc.aplicarTaxa();

        cp.depositar(1000);
        cp.aplicarJuros();

        banco.mostrarContas();
    }
}
