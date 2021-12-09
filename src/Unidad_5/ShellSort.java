/*
 Shell soart mejora el ordenamiento por inserccion es decir compara los elementos separados por un espacio de varias posiciones, esto permite que un elemento realice pasos mas grandes es decir 
permite avanzar mas rapido hacia su posicion esperada 
 */
package Unidad_5;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se permite al ususario el ingreso ed datos al sistema
        Scanner datos = new Scanner(System.in);
        //Se declaran arreglos a utilizar (asigna nombre, define tipo y tamano)
        int Arreglo[] = new int[20];
        //Se declaran variables a utilizar
        int numero, i, j, incremento, aux;

        System.out.println("Ingrese la dimension del arreglo (tamano) ");
        numero = datos.nextInt();

        for (i = 1; i <= numero; i++) {
            System.out.println("A[" + i + "]=");
            Arreglo[i] = datos.nextInt();

        }
        //Se iguala  incremento a numero y se divide entre dos 
        incremento = numero / 2;
        //Se crea ciclo para validar las posiciones de los elementos 
        while (incremento > 0) {
            for (i = incremento + 1; i <= numero; i++) {
                j = i - incremento;
                while (j > 0) {
                    if (Arreglo[j] >= Arreglo[j + incremento]) {
                        aux = Arreglo[j];
                        Arreglo[j] = Arreglo[j + incremento];
                        Arreglo[j + incremento] = aux;

                    } else {
                        j = 0;
                    }
                    j = j - incremento;
                }

            }
            incremento = incremento / 2;
        }
        System.out.println("El arreglo esta ordenado");
        for (i = 1; i <= numero; i++) {
            System.out.println(" " + Arreglo[i]);
        }
    }

}
