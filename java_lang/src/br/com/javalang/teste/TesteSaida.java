package br.com.javalang.teste;

import java.io.*;

public class TesteSaida {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("caelum - apostila java orientação a objetos");

        bw.close();


        OutputStream oss = new FileOutputStream("arquivo.txt");
        OutputStreamWriter osww = new OutputStreamWriter(oss);
        BufferedWriter bww = new BufferedWriter(osww);

        bww.write("Teste de Entrada");

        bww.close();
    }
}
