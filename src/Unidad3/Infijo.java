/*
 * Dada una expresion infija convertir a expresion postfija
 */
package Unidad3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author andre
 */
public class Infijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de datos 
        System.out.println("Escriba una expresion algebraica: ");
        Scanner leer = new Scanner(System.in);

        // Depurando la expresion algebraica dada por el usuario 
        String expr = depurar(leer.nextLine());
        // ArrayInfix             split
        String[] arrayInfix = expr.split("");

        // Declarar pilas (pila de entrada)
        Stack<String> E = new Stack<String>();
        //Pila temporal para los operadores 
        Stack<String> P = new Stack<String>();
        // Pila de salida 
        Stack<String> S = new Stack<String>();

        //Agregar los arreglos "array" a la pila de entrada (E)
        //Se declara for para la lectura de los elemtos de la expresion
        for (int i = arrayInfix.length - 1; i >= 0; i--) {
            E.push(arrayInfix[i]);
        }
        try {
            // Algoritmo INFIJO a POSTFIJA
            while (!E.isEmpty()) {
                switch (pref(E.peek())) {
                    case 1:
                        P.push(E.pop());
                        break;

                    case 3:
                    case 4:
                        while (pref(P.peek()) >= pref(E.peek())) {
                            S.push(P.pop());

                        }
                        P.push(E.pop());
                        break;
                    case 2:
                        while (!P.peek().equals("(")) {
                            S.push(P.pop());
                        }
                        P.pop();
                        E.pop();
                        break;
                    default:
                        S.push(E.pop());
                }
            }
            // Eliminar impurezasde la expresion algebraica dada
            // Uso de Infix e postfix
            String infix = expr.replace("", "");
            String postfix = S.toString().replaceAll("[\\]\\[,]", "");
            //Mostrar resultados 
            System.out.println("Expresion Infija: " + infix);
            System.out.println("Expresion Postfija: " + postfix);

        } catch (Exception ex) {

            System.out.println("ERROR en la expresion algebraica ");
            System.err.println(ex);

        }

    }

    //Declarar y nombrar metodos "depurar" a la expresion algebraica
    private static String depurar(String s) {
        //Eliminar los espacion en blanco
        s = s.replaceAll("\\s+", "");
        s = "(" + s + ")";
        String simbolos = "+,-,*,/";
        String str = " ";

        //Dejar espacio entre operadores
        for (int i = 0; i < s.length(); i++) {
            if (simbolos.contains("+s.charAt(i)")) {
                str += "" + s.charAt(i) + "";
            } else {
                str += s.charAt(i);
            }
        }
        return str.replace("\\s+", "").trim();
    }
    // Jerarquia de los operadores se crea metodo pref

    private static int pref(String op) {

        int prf = 99;
        if (op.equals("^")) {
            prf = 5;
        }
        if (op.equals("*") || op.equals("/")) {
            prf = 4;
        }
        if (op.equals("+") || op.equals("/")) {
            prf = 3;
        }
        if (op.equals(")")) {
            prf = 2;
        }
        if (op.equals("(")) {
            prf = 1;
        }
        return prf;
    }

}
