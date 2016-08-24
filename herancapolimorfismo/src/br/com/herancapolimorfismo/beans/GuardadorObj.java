package br.com.herancapolimorfismo.beans;

public class GuardadorObj {
    private Object[] arrayObjeto = new Object[100];
    int posicao = 0;

    public void adicionaObj(Object object){
        this.arrayObjeto[this.posicao] = object;
        this.posicao++;
    }

    public Object pegaObj(int indice){
        return this.arrayObjeto[indice];
    }
}
