package br.com.threads.teste;

import br.com.threads.beans.Programa;

public class TestePrograma {
    public static void main(String[] args) {
       /* new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                System.out.println("programa 1 valor " + i);
        }).start();

        // utilizando lambda para implementar runnable
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++)
                System.out.println("Programa 1 valor " + i);
        };
        Thread t = new Thread(r);
        t.start();*/


        Programa p1 = new Programa();
        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        Programa p2 = new Programa();
        p2.setId(2);
        Thread t2 = new Thread(p2);
        t2.start();
    }
}
