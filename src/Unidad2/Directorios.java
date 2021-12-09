package Unidad2;

import java.io.File;

/*
 * Uso de la clase FILE para implementar recursividad
 */
/**
 *
 * @author andre
 */
public class Directorios {
    //Crear metodo simple para crear y recorrer todos los directorios y archivos

    public void leer(String inicio, String altura) {

        // Se crea el objeto archivos con el directorio que llega como parametro y mediante el objeto list obtenemos los archivos y directorios
        File archivos = new File(inicio);
        String[] dir = archivos.list();
        //Mediante el for se recorre todo el vector o el total de elementos del objeto
        for (int i = 0; i < dir.length; i++) {
            //Se crea un objeto de la clase File para cada directorio y archivo
            
            File archivos2 = new File(inicio + dir[i]);
            //Se verifica si se trata de un archivo o de un directorio 
            if (archivos2.isFile()) {
                System.out.println(altura + dir[i]);
                if (archivos2.isDirectory()) {
                    //Si es un archivo lo mostramos y si es un directorio se muestra y se llama recursivamente al metodo leer con el directorio nuevo a mostrar
                    System.out.println(altura + "Directorio: " + dir[i].toUpperCase());
                    leer(inicio + dir[i] + "\\", altura + " ");
                }
            }

        }

    }
}
