package br.com.javalang.teste;

public class TesteInteger {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        if(i1.equals(i2)){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }
    }
}
