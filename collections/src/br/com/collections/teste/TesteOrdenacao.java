package br.com.collections.teste;

import br.com.collections.beans.ContaP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacao {
    public static void main(String[] args) {
        List<ContaP> contas = new ArrayList<>();

        ContaP c1 = new ContaP();
        c1.setNumero(1973);
        contas.add(c1);

        ContaP c2 = new ContaP();
        c2.setNumero(1462);
        contas.add(c2);

        ContaP c3 = new ContaP();
        c3.setNumero(1854);
        contas.add(c3);

        //Ordena em ordem crescente numeros da CP
        //Collections.sort(contas);

        //Reverte ordem
        contas.sort(Collections.reverseOrder());

        for (ContaP conta : contas) {
            System.out.println("número: " + conta.getNumero());
        }

        //Imprime num de forma randomica
       /* for(int i=0; i<5;i++){
            System.out.println(Math.random());
        }*/
    }
}
