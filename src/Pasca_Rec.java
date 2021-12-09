
import java.util.Scanner;

/*
 * Generar el triangulo de pascal y aqui el usuario define el numero de filas ( Se utiliza recursividad )
 */
/**
 *
 * @author andre
 */
public class Pasca_Rec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el numero de filas: ");

        int filas = sc.nextInt();

        System.out.println("Triangulo de pascal ");

        print(filas);
        sc.close();

    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + (" "));
            }
            System.out.println();
        }

    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);

        }

    }

}
