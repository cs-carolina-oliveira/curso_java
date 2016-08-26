package br.com.exerciciojavaoo.teste;

import br.com.exerciciojavaoo.beans.Funcionario;
import br.com.exerciciojavaoo.beans.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Jõao");
        gerente.setSenha(1234);
        gerente.setSalario(5015.40);

        //valida senha de gerente
        gerente.autentica(1234);
        System.out.println("Sua bonificação foi de " + Math.round(gerente.getBonificacao()));

        Gerente gerente1 = new Gerente();
        Funcionario funcionario = gerente1;
        funcionario.setSalario(5000.0);

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000);

        //Imprime bonificação de funcionarios
        System.out.println(funcionario.getBonificacao());
    }
}
