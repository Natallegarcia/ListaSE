/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estruturaDeDados;

/**
 *
 * @author mpe02
 */
public interface ILista {
    public int getTamanho();
    public void inserirInicio(int elemento)throws Exception;
    public int acessarInicio() throws Exception;
    public void retirarInicio() throws Exception;
    public String obterLista() throws Exception;
    public boolean estaVazia();
}
