/*
Se ordenan los elementos de un arreglo (valores introducidos por el usuario) por el metodo BURBUJA
 */
package Unidad_5;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Burbuja {

    public static void main(String[] args) {
        int nn;

        //Se crea el objeto SC de la clase Scanner (permitir al usuario la introduccion de valores 
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina el tamano del arreglo");
        // En la variable nn se guarda el numero de elementos de nuestro arreglo 

        nn = sc.nextInt();

        // Se crea el arreglo del tamano nn 
        int ArrayN[] = new int[nn];

        //Se crea ciclo para llenar el arreglo con los numeros introducidos por el usuario 
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Elemento asignado en indice: " + (i + 1) + ":");
            ArrayN[i] = sc.nextInt();

        }

        //Mostrar el arreglo pero SIN ordenar
        System.out.println("***Los elementos NO estan ordenados*** ");
        //Se llama al metodo 
        mostrarN(ArrayN);
        //Preguntar si se quiere ordenar

        System.out.println("Desea ordenar los numeros? S/N");

        Scanner sc2 = new Scanner(System.in);
        // Vamos a capturar lo que se introduce por teclado (leer respuesta)

        String res = sc2.nextLine();

        //En caso de que seleccione "S" entra si no entonces sale
        if (res.equalsIgnoreCase("S")) {
            //Muestra los valores del arreglo ya ordenado

            System.out.println("*** Arreglo Ordenado ***");
            //Llamar al metodo para ordenar
            ordenaBurbuja(ArrayN);

        }

    }

    //Metodo de ordenacion mediante algoritmo BURBUJA
    public static void ordenaBurbuja(int ArrayN[]) {

        // Ciclo que inicie desde cero hasta el total de elementos del arreglo(array-1)
        for (int i = 0; i < ArrayN.length - 1; i++) {
            //Ciclo anidado desde 0 hasta array-1
            for (int j = 0; j < ArrayN.length - 1; j++) {
                //Si el numero almacenado en la posicion j es mayor que el de la posicion j+1 (El siguiente del arreglo)
                if (ArrayN[j] > ArrayN[j + 1]) {
                    //Guardar el numero de la posicion j+1 en una variable (el menor)
                    int temp = ArrayN[j + 1];
                    //Intercambiar posicion 
                     ArrayN[j+1] = ArrayN[j];
                    ArrayN[j] = temp;
                    //Volver al inicio para comparar los siguientes valores hasta que el total de estos hayan sido comparados porque de esta forma se van pasando y ordenando los numero mayores hasta el final del arreglo

                }
            }
        }
        //Llamar al metodo mostrarN, si ordena se da por hecho que si lo quiere mostrar 
        mostrarN(ArrayN);

    }
    //Metodo para mostrar el arreglo

    public static void mostrarN(int ArrayN[]) {

        System.out.println("*************");
        //Ciclo para mostrar el arreglo desde la posicion cero hasta el total de elementos del arreglo 

        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Elemento " + (i + 1) + "----> " + ArrayN[i] + "\n");
        }
        System.out.println("*************");
    }
}
