package br.com.herancapolimorfismo.beans;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super();
    }


    public ContaPoupanca() {
    }

    @Override

    public void atualizar(double taxa) {
        super.saldo += super.saldo * taxa * 3;
    }
}
