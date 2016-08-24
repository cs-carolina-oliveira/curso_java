package br.com.javalang.teste;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by carolinaoliveira on 24/08/16.
 */
public class TesteEntrada {
    public static void main(String[] args) throws IOException {
       /* Scanner leitor = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivo.txt");
        while (leitor.hasNextLine());
        ps.println(leitor.nextLine());*/



        InputStream is = new FileInputStream("saida.txt");
        // InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String c = br.readLine();


        while (c != null) {
            // JOptionPane.showMessageDialog(null, c);
            System.out.println(c);
            c = br.readLine();
        }
        br.close();

    }
}
