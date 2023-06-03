//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
// Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.

import java.util.Arrays;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Insira o " + (i+1) + "ª número: ");
            vetor[i] = entrada.nextInt();
        }

        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorIdade) {
                menorIdade = vetor[i];
                posicaoMenor = i;
            }

            if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("As idades do vetor é: " + Arrays.toString(vetor));
        System.out.println("Menor idade é: " + menorIdade + ", posição é: " + posicaoMenor);
        System.out.println("Maior idade é: " + maiorIdade + ", posição é: " + posicaoMaior);
    }
}
