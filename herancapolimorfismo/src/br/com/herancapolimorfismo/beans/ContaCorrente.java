package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo) {
        super();
    }

    public ContaCorrente() {
    }

    @Override
    public void atualizar(double taxa){
        super.saldo +=super.saldo*taxa*2;
    }

    @Override
    public void depositar(double valor){
        super.saldo+=valor-0.10;
    }


    public double calculaTributos() {
        return this.getSaldo()*0.01;
    }
    ContaCorrente cc = new ContaCorrente();
    Tributavel t = new ContaCorrente();
}
