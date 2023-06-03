//Crie um programa para exibir a soma de 20 números usando uma matriz.

import java.util.Random;

public class exercicio09 {
    public static void main(String[] args) {

        int n = 20;
        int a[] = new int[n];
        int i;
        int sm = 0;

        for (i=0; i<n; i++) {
            a[i] = (int)Math.round(Math.random() * 100);

            sm = sm + a[i];

            System.out.printf("a[%d] = %2d\n", i, a[i]);
        }

        System.out.printf("\nSoma dos elementos do vetor = %d.\n", sm);

        }

    }
