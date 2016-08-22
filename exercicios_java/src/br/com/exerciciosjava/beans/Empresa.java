package br.com.exerciciosjava.beans;

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

    public String getNome() {

        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public static void adiciona(Funcionario f){
        this.funcionario[] = f;
    }
}
