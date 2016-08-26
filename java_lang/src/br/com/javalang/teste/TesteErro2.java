package br.com.javalang.teste;

import javax.swing.*;

public class TesteErro2 {
    public static void main(String[] args) {
        try {
            metodo();
        } catch (RuntimeException ex) {
            System.out.println("Exception pega");
        }
        System.out.println("Após invocação do método");
    }

    private static void metodo() {
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            System.out.println(n[i]);
        }
        System.out.println("\n" + "O número na posição 2 é " + n[2]);
        System.out.println("Após executar exception");

    }
}
