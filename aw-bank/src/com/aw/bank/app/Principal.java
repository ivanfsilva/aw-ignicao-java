package com.aw.bank.app;

import com.aw.bank.modelo.CaixaEletronico;
import com.aw.bank.modelo.ContaEspecial;
import com.aw.bank.modelo.ContaInvestimento;
import com.aw.bank.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("22233344455");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1_000);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);
        minhaConta.creditarRendimentos(0.8);
        minhaConta.debitarTarifaMensal();

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);
        suaConta.debitarTarifaMensal();

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);
    }
}