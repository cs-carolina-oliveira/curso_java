package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Conta {
    protected String nome;
    protected long cpf;
    protected String rg;
    protected double saldo;

    public Conta() {
    }

    public Conta(String nome, long cpf, String rg, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }

    public void sacar(double valor){
        this.saldo-=valor;
    }

    public void atualizar(double taxa){
        this.saldo += this.saldo*taxa;
    }


}
