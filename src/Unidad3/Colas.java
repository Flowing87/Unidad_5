/*
 1.- Se crean dos colas cada una con un tipo de dato diferente. 

 */
package Unidad3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author andre
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> colaDatos = new LinkedList<String>();
        System.out.println("Insertar 3 elementos en la cola: Raul, Irvin y Alejandro");

        colaDatos.add("Raul");
        colaDatos.add("Irvin");
        colaDatos.add("Alejandro");

        System.out.println("Cantidad de elementos en la cola es: " + colaDatos.size());
        // Se utiliza metodo poll para extraer elemento
        System.out.println("Extraemos un elemento en la cola: " + colaDatos.poll());
        //Se verifica el tamano actual de la cola una vez extraido elemento
        System.out.println("Cantidad de elementos en la cola: " + colaDatos.size());
        // Extraes total de elementos de la cola 
        while (!colaDatos.isEmpty()) {
            System.out.print(colaDatos.poll() + "-");
            System.out.println();

        }
        //Se crea segunda cola para integrar elementos de tipo entero 
        Queue<Integer> colaNum = new LinkedList<Integer>();
        {
            colaNum.add(88);
            colaNum.add(44);
            colaNum.add(22);
            //Mostrar elementos de colaNum
            System.out.println("Mostrar elementos de la cola (numericos)");
            for (Integer elemento : colaNum) 
                System.out.print(elemento+"-");
                System.out.println();
                System.out.println("Se borra el total de elementos de colaNum");
                colaNum.clear();
                System.out.println("La cantidad de elementos de la cola tipo entero es: " + colaNum.size());
            

        }
    }

}
