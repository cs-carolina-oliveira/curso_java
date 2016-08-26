package br.com.javalang.teste;

import java.io.*;

public class TesteEntrada {
    public static void main(String[] args) throws IOException {
        /* Scanner leitor = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivo.txt");
        while (leitor.hasNextLine());
        ps.println(leitor.nextLine());*/


        try {
            InputStream is = new FileInputStream("testa-io.txt");
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
        } catch (FileNotFoundException e) {
            System.out.print("Erro " + e);
        }

    }
}
