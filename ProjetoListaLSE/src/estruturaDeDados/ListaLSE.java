/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDeDados;

/**
 *
 * @author mpe02
 */
public class ListaLSE implements ILista{
    //atributos
    private int tamanho = 0;
    private No inicio = null;
    private No fim = null;

    public ListaLSE() {
        tamanho = 0;
        inicio = null;
        fim = null;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void inserirInicio(int elemento) throws Exception {
        No aux = new No(elemento, inicio);
        inicio = aux;
        if(estaVazia()) fim = aux;
        tamanho++;
    }

    @Override
    public int acessarInicio() throws Exception {
        if(estaVazia())throw new Exception("Esta vazia");
        return inicio.getDado();
    }

    @Override
    public void retirarInicio() throws Exception {
    if(estaVazia())throw new Exception("Esta vazia");
        inicio = inicio.getProximo();
        tamanho--;
     if(estaVazia()) fim = null;
    }

    @Override
    public String obterLista() throws Exception {
        if(estaVazia())return "Lista = {}";
        String saida = "lista = {";
       for(No aux = inicio; aux != null; aux = aux.getProximo()){
           saida += aux.getDado()+ " ";
       }
       saida +="}";
       return saida;
    }

    @Override
    public boolean estaVazia() {
    return (tamanho == 0);
    }
    
}
