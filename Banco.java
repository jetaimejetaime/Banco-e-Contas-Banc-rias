package com.exemplo.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta " + conta.getNumero() + " adicionada com sucesso.");
    }

    public void mostrarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumero() + ", Saldo: R$" + conta.getSaldo());
        }
    }
}
