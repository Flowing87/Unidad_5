/*
Ejecuta javaclass de ArbolBinario y leer
 */
package Unidad4;

/**
 *
 * @author andre
 */
public class Pcpal {

    public static void Menu() {
        //creo mi menu, se muestran las opciones
        System.out.println("");
        System.out.println("         MENU      \n");
        System.out.println("---------------------");
        System.out.println(" [1]  Crea Arbol: se ingresan los nodos.");
        System.out.println(" [2]  Recorrido preorden");
        System.out.println(" [3]  Recorrido inorden");
        System.out.println(" [4]  Recorrido postorden ");
        System.out.println(" [5]  Realizar los tres recorridos");
        System.out.println(" [6]  Realizar la busqueda de un número");
        System.out.println(" [7]  Sumar los números");
        System.out.println(" [8]  Hallar el promedio de los nodos");
        System.out.println(" [9]  Mostrar cantidad de número pares");
        System.out.println(" [10] Eliminar nodo");

        System.out.println(" (0) Salir \n");
        System.out.println("Ingresar Opción \n");
    }

    public static void main(String args[]) {
        //Se crea objeto "abo"
        ArbolBinario abo = new ArbolBinario();
        //Se declara variable a utilizar en Switch (para seleccion de opciones )
        int opc;
        Menu();
        System.out.println("Elegir opción: ");
        opc = Leer.datoInt();
        System.out.println("");
        //en cada opcion se llama a cada metodo segun corresponda
        while (opc != 0) {
            switch (opc) {
                case 0: {
                    System.out.println("Salir");
                    break;
                }

                case 1: {
                    abo.insertarteclado();
                    break;
                }

                case 2: {
                    //Se muestra mensaje
                    System.out.println("PRE_ORDEN: ");
                    //Se concatena al objeto creado el metodo que contiene las instrucciones para el recorrido del arbol en preorden
                    abo.preorden();
                    break;
                }

                case 3: {
                    System.out.println("IN-ORDEN: ");
                    abo.inorden();
                    break;
                }

                case 4: {
                    System.out.println("POST-ORDEN: ");
                    abo.postorden();
                    break;
                }

                case 5: {
                    System.out.println("PRE-ORDEN: ");
                    abo.preorden();
                    System.out.println("IN-ORDEN: ");
                    abo.inorden();
                    System.out.println("POST-ORDEN: ");
                    abo.postorden();
                    break;
                }

                case 6: {
                    int bus;
                    System.out.println("Ingresar el número a buscar: ");
                    bus = Leer.datoInt();
                    System.out.println("" + abo.buscar(bus));
                    break;
                }

                case 7: {
                    System.out.println("" + abo.sumar());
                    break;
                }

                case 8: {
                    Double prom = 0.0;
                    System.out.println("" + abo.promedio());
                    break;
                }

                case 9: {
                    System.out.println("" + abo.pares());
                    break;
                }

                case 10: {
                    abo.borrarnodo();
                    break;
                }
            }
            Menu();
            opc = Leer.datoInt();
        }
    }

}
