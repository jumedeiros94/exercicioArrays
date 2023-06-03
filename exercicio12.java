//Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão
// armazenados o valores pares e ímpares de A, respectivamente.

public class exercicio12 {
    public static void main(String[] args) {

        int n = 20;
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int i, j, k;

        for (i=0; i<n; i++) {
            a[i] = (int)Math.round(Math.random() * 100);
        }

        j = 0;
        k = 0;
        for (i=0; i<n; i++) {
            if ((a[i] % 2) == 0) {
                b[j] = a[i];
                j = j + 1;
            }
            else {
                c[k] = a[i];
                k = k + 1;
            }
        }

        System.out.printf("Vetor 'a'__________________________________________________\n");
        for (i=0; i<n; i++) {
            System.out.printf("%2d ", a[i]);
        }

        System.out.printf("\n\nVetor 'b' (os elementos pares do vetor 'a')________________\n");
        for (i=0; i<j; i++) {
            System.out.printf("%2d ", b[i]);
        }

        System.out.printf("\n\nVetor 'c' (os elementos impares do vetor 'a')______________\n");
        for (i=0; i<k; i++) {
            System.out.printf("%2d ", c[i]);
        }

        System.out.printf("\n");
    }
    }
