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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(45);
      DoubleLinkedList arbol = new DoubleLinkedList();
      
     nodo1.setNextElement(nodo1);
     nodo1.setPreviousElement(nodo1);
     nodo1.setValor(4);
     arbol.addFirst(6);
     arbol.addFirst(7);
     arbol.addFirst(9);
     arbol.addLast(5);
     arbol.print();
      
      
    }
    
}
