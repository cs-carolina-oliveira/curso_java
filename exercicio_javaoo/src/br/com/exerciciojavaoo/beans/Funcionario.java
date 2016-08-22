package br.com.exerciciojavaoo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Funcionario {
    protected String nome;
    protected String depto;
    protected double salario;
    protected String dtEntrada;
    protected String rg;


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepto(String nome) {
        this.depto = depto;
    }
    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public String getDepto() {
        return depto;
    }
    public double getSalario() {
        return salario;
    }
    public String getDtEntrada() {
        return dtEntrada;
    }
    public String getRg() {
        return rg;
    }
    public Funcionario(String nome, String depto, double salario, String dtEntrada, String rg) {
        this.nome = nome;
        this.depto = depto;
        this.salario = salario;
        this.dtEntrada = dtEntrada;
        this.rg = rg;
    }
    public Funcionario() {
    }
    public void recebeAumento(double aumento){
        double novoSalario = this.salario + aumento;
        this.salario = novoSalario;
        System.out.println(novoSalario);
    }
    public double ganhoAnual(){
        double ganho = this.salario*12;
        return ganho;
    }
    public String getTudo(){
        return "Nome: " + nome + "\n" + "Depto" + depto + "\n" + "Salario: " + salario +
                "\n" + "Data de Entrada: " + dtEntrada + "\n" + "RG: " + rg;
    }

    public double getBonificacao(){
        return this.getSalario()*0.10;
    }
}
