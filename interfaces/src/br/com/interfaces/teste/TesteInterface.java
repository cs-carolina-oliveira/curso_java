package br.com.interfaces.teste;

import br.com.interfaces.beans.AreaCalculavel;
import br.com.interfaces.beans.Retangulo;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class TesteInterface {
    public static void main(String[]args){
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
    }
}
