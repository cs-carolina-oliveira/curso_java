package br.com.exerciciojavaoo.beans;

import javax.swing.*;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Gerente extends Funcionario{
    private int senha;
    private int numeroFuncionarioGerenciados;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public int getNumeroFuncionarioGerenciados() {
        return numeroFuncionarioGerenciados;
    }

    public void setNumeroFuncionarioGerenciados(int numeroFuncionarioGerenciados) {
        this.numeroFuncionarioGerenciados = numeroFuncionarioGerenciados;
    }

    public Gerente(String nome, String depto, double salario, String dtEntrada, String rg, int senha, int numeroFuncionarioGerenciados) {
        super(nome, depto, salario, dtEntrada, rg);
        this.senha = senha;
        this.numeroFuncionarioGerenciados = numeroFuncionarioGerenciados;
    }

    public Gerente(int senha, int numeroFuncionarioGerenciados) {
        this.senha = senha;
        this.numeroFuncionarioGerenciados = numeroFuncionarioGerenciados;
    }

    public Gerente() {
    }

    public boolean autentica(int senha){
        if(this.senha==senha){
            JOptionPane.showMessageDialog(null, "Acesso Permitido!");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado!");
            return false;
        }
    }

    @Override
    public double getBonificacao(){
        return super.salario*0.15+1000;
    }

    public String getTudo(){
        return super.getTudo() + "\n" + senha + "\n" + numeroFuncionarioGerenciados;
    }
}
