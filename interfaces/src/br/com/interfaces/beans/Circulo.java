package br.com.interfaces.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Circulo implements AreaCalculavel{
    private int raio;

    public double calculaArea(){
        return Math.PI * this.raio * this.raio;
    }
}
