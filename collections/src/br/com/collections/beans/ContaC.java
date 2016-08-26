package br.com.collections.beans;

public class ContaC extends Conta implements Comparable<ContaC> {
    public ContaC(String nome, long cpf, String rg, double saldo, double limite, int numero) {
        super(nome, cpf, rg, saldo, limite, numero);
    }

    public ContaC() {
        super();
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    public int compareTo(ContaC outra) {
        if (this.saldo < outra.saldo) {
            return -1;
        } else if (this.saldo > outra.saldo) {
            return 1;
        } else
            return 0;
    }

}
