package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class GerenciadorDeImpostoDeRenda {
    private  double total;

    public void adiciona(Tributavel t){
        System.out.println("Adiciona tributavel: " + t);

        this.total +=t.calculaTributos();
    }

    public double getTotal(){
        return this.total;
    }
}
