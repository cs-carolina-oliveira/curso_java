package br.com.herancapolimorfismo.beans;

public class AtualizaContas {
    private double saldoTotal = 0;
    private double selic;

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public AtualizaContas(double saldoTotal, double selic) {
        this.saldoTotal = saldoTotal;
        this.selic = selic;
    }

    public AtualizaContas() {
    }

    public AtualizaContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println(c.getSaldo());
        c.atualizar(2);
        saldoTotal += c.saldo;
        System.out.println(saldoTotal);
    }
}
