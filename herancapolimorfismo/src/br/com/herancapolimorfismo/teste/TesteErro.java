package br.com.herancapolimorfismo.teste;

public class TesteErro {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio metodo 1");
        metodo2();
        System.out.println("fim do metodo 1");

    }

    static void metodo2() {
        System.out.println("inicio metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro " + e);
        }

        System.out.println("fim do metodo2");
    }

}
