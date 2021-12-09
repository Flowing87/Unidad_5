/*
 Se crean metodos para simular los metodos propios de la clase stack (push,pop,empty). No se utliza la clase Stack.
 */
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Pilas_Sin_Stack {

    Scanner valores = new Scanner(System.in);
    //Se cera pila llamada "pila" y se determina el tipo de dato y tamano de la pila
    int pila1[] = new int[4];

    int tope = -1;

    //Se crea metodo push (agrega elemento a la pila)
    public int push() {
        if (tope >= pila1.length - 1) {
            System.out.println("La pila esta llena");

        } else {

            tope += 1;
            System.out.println("Ingresar el valor: ");
            pila1[tope] = valores.nextInt();

        }
        return 0;
    }
    //Se crea el metodo pop() para retirar el elemento   

    public int pop() {
        if (tope == -1) {
            System.out.println("La pila esta vacia");

        } else {

            System.out.println("Se elimino el elemento pila");
            pila1[tope] = 0;
            tope = -1;

        }
        return tope;
    }

    public void ver() {

        for (int tope = 3; tope >= 0; tope--) {
            System.out.println("Valores de la pila son: " + pila1[tope]);
        }

    }

}
