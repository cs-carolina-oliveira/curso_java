package br.com.interfaces.beans;

public class Circulo implements AreaCalculavel {
    private int raio;

    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }
}
