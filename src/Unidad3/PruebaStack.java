/*
 Uso de la clase predefinida Stack y EmptyStackException pernecen a la libreria util

Ejemplo: import java.util.*;
 */
package Unidad3;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author andre
 */
public class PruebaStack {
    //Declaracion y nombre de pila
    public PruebaStack(){
    Stack<Number> pila = new Stack<Number>();
    Long numeroLong =12L;
    Float numeroFloat =1.0F;
    Integer numeros =34567;
    Double numeroDouble = 1234.5678;
    //Agregar elementos a pila usar metodo push
    pila.push(numeroLong);
    imprimirPila(pila);
    pila.push(numeros);
    imprimirPila(pila);
    pila.push(numeroFloat);
    imprimirPila(pila);
    pila.push(numeroDouble);
    imprimirPila(pila);
    //Se declara la exception
    try{
    Number objetoEliminado = null;
            while (true) {
                objetoEliminado = pila.pop();
                System.out.printf("%s se quita \n");
                imprimirPila(pila);
            }
 
}catch(EmptyStackException emptyStackException){
   //Se utiliza metodo printStackTrace
   emptyStackException.printStackTrace();
}



}
private void imprimirPila(Stack<Number>pila){

if (pila.empty()) {
   System.out.println("La pila esta vacia \n\n");
}else{
System.out.printf("La pila contiene: ");

System.out.println("(Superipr");

}
}
}
