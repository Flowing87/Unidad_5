/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

/**
 *
 * @author andre
 */
public class DoubleLinkedList {

    private Nodo raiz;
    private Nodo rama;

    public void addLast(Integer valor) {

        Nodo nodos = new Nodo(valor);
        {
            // Se crea objeto
            if (rama == null && raiz == null) {

                rama = nodos;
                raiz = nodos;

            } else {
                rama.setNextElement(nodos);
                nodos.setPreviousElement(rama);
                rama = nodos;
            }

        }

    }

    // Metodo para agregar el primer elemento
    public void addFirst(Integer valor) {

        Nodo nodos = new Nodo(valor);
        if (rama == null && raiz == null) {
            raiz = nodos;
            rama = nodos;
        } else {

            nodos.setPreviousElement(raiz);
            raiz.setPreviousElement(nodos);
            raiz = nodos;

        }

    }
    //Metodo para mostrar valores 
    public void print(){
    
        for (Nodo i = raiz; i != null; i=i.getNextElement()) {
            System.out.printf("\t%s",i.toString());
        }
        System.out.println();
    }
}
