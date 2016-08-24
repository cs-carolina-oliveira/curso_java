package br.com.javalang.teste;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class TesteEntrada2 {
    public static void main(String[] args) throws IOException {
       /* BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("teste-io.txt")
                ));

        JOptionPane.showInputDialog("Digite sua mensagem: ");
        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();*/


        InputStream is = new FileInputStream("arquivo.txt");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua mensagem: ");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
    }
}
