package br.com.collections.beans;

public class Conta {
    protected String nome;
    protected long cpf;
    protected String rg;
    protected double saldo;
    protected double limite;
    protected int numero;

    protected Conta() {

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

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    Conta(String nome, long cpf, String rg, double saldo, double limite, int numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }


    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou depositar  um valor negativo");
        } else {
            this.saldo += valor - 0.10;
        }
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            throw new ValorInsuficiente("Saldo Insuficiente, tente um valor menor.");
        } else {
            this.saldo -= valor;
        }


    }

    public String getTudo() {
        return "Nome: " + nome + "\n " + "CPF: " + cpf + "\n " + "RG: " + rg + "\n " + "Limite: " + limite;
    }
}
