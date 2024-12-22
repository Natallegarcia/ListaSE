/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolistalse;
import estruturaDeDados.*;
/**
 *
 * @author mpe02
 */
public class ProjetoListaLSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        ILista lista = new ListaLSE();
        System.out.println(lista.obterLista());
            System.out.println(lista.estaVazia());
            System.out.println(lista.getTamanho());
            lista.inserirInicio(30);
             System.out.println(lista.getTamanho());
            lista.inserirInicio(20);
             System.out.println(lista.getTamanho());
            lista.inserirInicio(10);
             System.out.println(lista.getTamanho());
             System.out.println(lista.obterLista());
            lista.retirarInicio();
            System.out.println(lista.obterLista());
            lista.retirarInicio();
            System.out.println(lista.obterLista());
            lista.retirarInicio();
            System.out.println(lista.obterLista());
            lista.inserirInicio(26);
            lista.retirarInicio();
            lista.retirarInicio();

             System.out.println(lista.obterLista());
        }catch(Exception erro){
            System.out.println("erro: "+ erro.getMessage());
        }
    }
    
}
