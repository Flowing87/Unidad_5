/*
 Se implementa clase predefinida PriorityQueue y algunos de sus metodos 
Para insertar se utlilizan los metodos de: 
INSERTAR add(v) / offer(v)  
EXTRAER: remove() / poll()
CONSULTAR: element() / peek()
  */
package Unidad3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author andre
 */
public class Cola_Prority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 1.- Uso de interfaces Queue
        //Se crea y nombra objeto para los elementos de cola 
       PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
       //Se asignan valores especificos mismos que se alojan en el objeto creado "Cola1"
       cola1.add(70);
       cola1.add(170);
       cola1.add(700);
       cola1.add(10);
       cola1.add(270);
       
        System.out.println("Imprimir los valores de la cola con prioridades de entero: ");
        //Se crea while para comparar valores
        while (!cola1.isEmpty()) {
            //Se usa metodo poll para extraer valores 
            System.out.println(cola1.poll()+"-");
        }
      
        
        // 2- Usar en segundo ejemplo Queue (elementos del mismo tipo ) y LinkedList() sobre elementos de diferente tipo
        
        // Crear cola e indicar el tipo de dato
        Queue<Integer> cola2 = new LinkedList<Integer>();
        //Insertar datos
        cola2.offer(3);
        cola2.add(14);
        cola2.offer(13);
        cola2.add(7);
        cola2.offer(30);
        
        //Mostrar datos de la cola 
        
        System.out.println("Cola esta llena:" + cola2);
        //Se usa while para desencolar
        while (cola2.poll()!=null) {
            // Se desencola y se compara el valor
            System.out.println(cola2.peek());
            // Se muestra el frente actual
          
            //Debera mostrar null para indicar que la cola esta vacia 
            
             
            
        }
   
    } 
     
}
