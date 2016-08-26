package br.com.collections.beans;

public class ContaP extends Conta implements Comparable<ContaP> {
    public ContaP() {
    }

    public ContaP(String nome, long cpf, String rg, double saldo, double limite, int numero) {
        super(nome, cpf, rg, saldo, limite, numero);
    }


    @Override
    public int compareTo(ContaP contaP) {
        if (this.getNumero() < contaP.getNumero()) {
            return 0;
        } else if (this.getNumero() > contaP.getNumero()) {
            return -1;
        }
        return 1;
    }

}