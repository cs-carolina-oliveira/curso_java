package br.com.exerciciojavaoo.teste;

import br.com.exerciciojavaoo.beans.Funcionario;

import javax.swing.*;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class TesteFuncionario {
    public static String txt(String msg){
        return JOptionPane.showInputDialog("Digite o " + msg);
    }

    public static double num(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(txt(msg)));
    }


    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Hugo");
        f1.setDepto("Vendas");
        f1.setSalario(1500.46);
        f1.setDtEntrada("12/05/2016");
        f1.setRg("114588963");
        Funcionario f2 = new Funcionario();
        f2.setNome("Daniel");
        f2.setDepto("Marketing");
        f2.setSalario(1263.40);
        f2.setDtEntrada("17/01/2016");
        f2.setRg("853367895");
        System.out.println("Salario atual: " + f1.getSalario() + "\n" +
                "Ganho anual: " + f1.ganhoAnual());
        JOptionPane.showMessageDialog(null, "Salario atual: " + f1.getSalario() + "\n" +
                "Ganho anual: " + f1.ganhoAnual());
        System.out.println(f1.getTudo() + "\n"+f2.getTudo());
        if (f1 == f2) {
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }

        /*  Funcionario func = new Funcionario(
            txt("nome "),
            txt("departamento "),
            num("salario"),
            txt("data de entrada "),
            txt("rg")
             );
         */
    }
}
