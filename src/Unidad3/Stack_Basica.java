/*
 Ejecuta a java class: Pila_Sin_Stack
 */
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Stack_Basica {

    public static void main(String[] args) {
        //Declarando y nombrando un objeto
        Pilas_Sin_Stack objeto = new Pilas_Sin_Stack();
        //Permitiendo al usuario el ingreso de datos
        Scanner opcion = new Scanner(System.in);
        //Se declara variable que guarda la opcion del usuario misma que se utiliza en el switch
        int seleccion;

        do {
            //Se crea menu de PILA
            System.out.println("Menu de pila: ");
            //Push: Insertar tope
            System.out.println("1.- Push: ");
            //Pop: Sacar el tope de la pila
            System.out.println("2.- Pop: ");
            //Ver la pila completa
            System.out.println("3.- Mostrar pila:  ");
            //Salir del menu
            System.out.println("3.- Salir: ");
            System.out.println("Tecle la opcion: ");
            //Se asigna variable utilizada switch
            seleccion = opcion.nextInt();
            //Se muestran las opciones al usuario y se ejecutan las instrucciones del metodo creado
            switch (seleccion) {
                //Se concatena al objeto creado el metodo desarrollado
                case 1:
                    objeto.push();

                    break;
                case 2:
                    objeto.pop();
                    break;
                case 3:
                    objeto.ver();
                    break;
                default:
                    System.out.println("Error\n opcion no valida");
            }

        } while (seleccion != 4);

    }
}
