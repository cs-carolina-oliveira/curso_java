package br.com.interfaces.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
class Quadrado implements AreaCalculavel{
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public double calculaArea(){
        return this.lado * this.lado;
    }
}

