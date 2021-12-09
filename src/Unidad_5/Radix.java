/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_5;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Radix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se permite entrada de datos al usuasrio

        Scanner entrada = new Scanner(System.in);
        //Se muestra mensaje al usuario
        System.out.println("Cuantos elementos deseas ordenar? ");

        int n = entrada.nextInt();
        int vector[] = new int[n];
        int matriz[][] = new int[10][20];
        //Se crea un ciclo para determinar el valor de cada una de las posiciones del total del arerglo

        for (int i = 0; i < n; i++) {
            System.out.println("Escribe un numero: ");
            vector[i] = entrada.nextInt();

        }
        int a;
        int col = 0;
        for (int i = 0; i < n; i++) {
            a = vector[i] % 10;
            if (matriz[a][col] == 0) {
                matriz[a][col] = vector[i];
            } else {
                col++;
                matriz[a][col] = vector[i];
            }
        }
        int i = 0;
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 20; c++) {
                if (matriz[f][c] != 0) {
                    vector[i] = matriz[f][c];
                    i++;
                }
            }
        }
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 20; c++) {
                matriz[f][c]=0;
            }
        }
        col=0;
        for (i = 0; i < n;i ++) {
            a=vector[i]/10;
            if (matriz[a][col]==0) {
                matriz[a][col]=vector[i];
                
            }else{
            col++;
            matriz[a][col]=vector[i];
            }
        }
        i=0;
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 20; c++) {
                if (matriz[f][c]!=0) {
                    vector[i]=matriz[f][c];
                }
            }
        }
        for (int f = 0; f < n; f++) {
            System.out.println(" ");
            System.out.println(vector[f]);
        }
    }

}
