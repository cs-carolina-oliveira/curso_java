package br.com.exerciciojavaoo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Empresa {
    private String nome;
    private String cnpj;
    Funcionario[] funcionario;

    public Empresa(String nome, String cnpj, Funcionario[] funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionario = funcionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {

        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Funcionario getFuncionatio(int posicao){
        return this.funcionario[posicao];
    }

    /*public void adiciona(Funcionario f){
        this.funcionario[] = f;
       } */
}
