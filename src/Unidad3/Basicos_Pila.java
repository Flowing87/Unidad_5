/*
 * Metodos basicos en una pila: 
1.- push() : Agregar elementos de la pila
2.- peek() : Para consultar el primer elemento
3.- search() : PAra buscar un elemento de la pila en especifico 
3.- empty() : Indica si la pila esta vacia
5.- pop() : Indica que se retira el primer elemento de la pila
 */
package Unidad3;

import java.util.Stack;

/**
 *
 * @author andre
 */
public class Basicos_Pila {
    public static void main(String[] args) {
         Stack pila = new Stack();
         // Se utiliza el metodo push de la clase predefinida Stack para agregar un elemento a la pila "pila"
         System.out.println("Agregando el numero 1 a la pila "+pila.push(1));
         System.out.println("Agregando el numero 2 a la pila "+pila.push(2));
         //Se utiliza metodo peek() para consultar el primer elemento de la "pila" 
          System.out.println("Consultando el primer elemento de la pila "+pila.peek());
          //Buscar a un elemento de la pila se utiliza el metodo search()
          System.out.println("Buscando al elemento 1 en la pila "+pila.search(1));
          //Para retirar al primer elemento de la pila se utiliza el metodo pop()
          System.out.println("Se retira el primer elemento de la pila: "+pila.pop());
          //Consultar el primer elemento de la pila (cima) se utiliza el metodo peek()
          System.out.println("Se consulta el primer elemento de la pila: "+pila.peek());
          //Consultar si la pila esta vacia, se utiliza el metodo empty()
          System.out.println("La pila esta vacia: "+pila.empty());
          //Buscar a un elemento en especifico de la pila (serach())
          System.out.println("Buscando el elemento 2 de la pila, su posicion es: "+pila.search(2));
          //Retirar el elemento de la pila
          System.out.println("Se retira el primer elemento de la pila: "+pila.pop());
          //La pila esta vacia...?
          System.out.println("La pila esta vacia: "+pila.empty());
    }
}
