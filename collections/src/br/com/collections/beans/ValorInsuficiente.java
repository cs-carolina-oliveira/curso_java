package br.com.collections.beans;

public class ValorInsuficiente extends RuntimeException {
    ValorInsuficiente(String msg) {
        super(msg);
    }
}

