package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super();
    }

    public ContaPoupanca() {
    }

    @Override
    public void atualizar(double taxa){
        super.saldo+=super.saldo*taxa*3;
    }
}
