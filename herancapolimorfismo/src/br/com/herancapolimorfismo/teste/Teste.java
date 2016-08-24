package br.com.herancapolimorfismo.teste;

import java.io.FileNotFoundException;

/**
 * Created by carolinaoliveira on 24/08/16.
 */
public class Teste {
    public static void main(String[]args){
        try {
            new java.io.FileInputStream("arquivo.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

   /* public static void metodo(){
        try{
            new java.io.FileInputStream("arquivo.txt");
        }catch(java.io.FileNotFoundException e){
            System.out.println("Não foi possivel abrir o arquivo para leitura");
        }

    }*/
}
