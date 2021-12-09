/*
Se asignan ciertos valores a nuestro arreglo y se ordenan por el metodo de ordenamiento "QuickSort" 
 */
package Unidad_5;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Valores antes de aplicar el metodo QuickSort" + Arrays.toString(numeros));
        quicksort(numeros, 0, numeros.length - 1);

        System.out.println("Valores despues del metodo QuickSort" + Arrays.toString(numeros));
        //Se crea arreglo y especifica valores diferente de numero es ecir de tipo caracter 

        String[] nombres = {"Cesar", "Andres", "Carlos", "Karen", "Scott"};
        //Mostrar elementos antes del metodo quicksort 
        quicksort(nombres, 0, nombres.length - 1);
        System.out.println("Valores despues del metodo QuickSort" + Arrays.toString(nombres));

    }

    //Se crea metodo para el control de la particion
    private static int particion(int arreglo[], int izquierda, int derecha) {
        //Seleccionar el pivote (Es el primero)
        int pivote = arreglo[izquierda];
        //Generar un ciclo

        while (true) {
            //Mientras que cada elemento este en orden(sea menor que pivote)

            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            //Mientras cada elemento desde la derecha este en orden o que sea mayor que el pivote entonces que continue disminuyendo el indice 
            while (arreglo[derecha] > pivote) {
                derecha--;
            }

            //Si la izquierda es mayor o igual que la derecha significa que No necesitamos hacer intercambio 
            if (izquierda >= derecha) {
                //Indica en donde nos quedamos y asi dividir el arreglo
                return derecha;
            } else {
                //Si el valor de izquierda NO supera el valor de derecha ni lo alcanza , significa que se detuvieron porque encontraron un valor en desorden y se intercambia

                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;

                //Ya una vez intercambiados se sigue avanzando
            }
            izquierda++;
            derecha--;

        }
        //El while se repite hasta que izquierda >= derecha

    }
    //Metodo para dividir el objeto que contiene el total de los elementos 

    private static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }

    //Se crea el metodo de particion 
    private static int particion(String arreglo[], int izquierda, int derecha) {
        //Seleccionar el pivote(el primero)
        String pivote = arreglo[izquierda];
        //Se crea un cilco
        while (true) {
            //Mientras que cada elemento de la izquierda este en orden y que sea menor el pivote
            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            //Mienrtras que cada elemento desde la derecha este en orden o que sea mayor que el pivote entonces que continue disminuyendo el indice 
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
            //Si la izquierda es mayor o igual que la derecha significa que NO necesitamos hacer ningun intercambio de variables pues los elementos ya estan en orden

            if (izquierda >= derecha) {
                //Aqui se indica en donde nos quedamos para poder dividir el arreglo y asi ordenar a los demas elementos 
                return derecha;

            } else {
                //Esto por si las variables quedaron algo lejos o sea cuando la izquierda ni supero ni alcanzo la derecha , entonces lo que significa es que se detuvieron porque encontraron un valor que no esta en orden, asique se intercambia
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                //Una vez intercambiados avanzamos
                izquierda++;
                derecha--;
            }
            //While se repite hasta que izquierda sea mayor o igual a derecha
        }

    }

    private static void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }

}
