/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDeDados;

/**
 *
 * @author mpe02
 */
public class No {
   //atributos
    private int dado = 0;
    private No proximo = null;
    //metodos

    public No() {
        dado = 0;
        proximo = null;
    }
    public No(int dado){
        this.dado = dado;
        this.proximo = null;
    }
    public No(int dado, No proximo){
        this.dado = dado;
        this.proximo = proximo;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
