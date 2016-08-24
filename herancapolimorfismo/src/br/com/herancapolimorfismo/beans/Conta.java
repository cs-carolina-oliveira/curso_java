package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Conta {
    protected String nome;
    protected long cpf;
    protected String rg;
    protected double saldo;
    protected double limite;

    public Conta() {
    }

    public Conta(String nome, long cpf, String rg, double saldo, double limite) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
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

    //Método depositar
    public void depositar(double valor){
        if(valor <0 ){
            throw new IllegalArgumentException("Você tentou depositar " + " um valor negativo");
        }else{
            this.saldo+=valor - 0.10;
        }
    }
    //Método Sacar
    public void sacar(double valor){
        if(saldo < valor){
            throw new SaldoInsuficienteException("Saldo Insuficiente, " + "tente um valor menor.");
        }else {
            this.saldo-= valor;
        }
    }

   /* public boolean saca(double quantidade) {
        if (quantidade > this.saldo + this.limite) {
            System.out.println("Não pode sacar acima do limite!");
            return false;
        } else {
            this.saldo -= quantidade;
            return true;
        }
    }*/

    //Método atualizar
    public void atualizar(double taxa){
        this.saldo += this.saldo*taxa;
    }


}
