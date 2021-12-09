/*
 * Se genera triangulo de Pascal de acuerdo al numero de rengloes introducido por el usuario, no se ultiliza recursividad
 
 */

/**
 *
 * @author andre
 */
public class Pascal_Sin_Rec {

    public static void main(String[] args) {

        int nfilas = 10;
        int[] a = new int[1];

        for (int i = 0; i < nfilas; i++) {
            int[] x = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i - 1)) {
                    x[j] = 1;

                } else {
                    x[j] = a[j] + a[j - 1];

                }
                System.out.print(x[j] + " ");

            }
            a = x;
            System.out.println();
        }

    }
}
