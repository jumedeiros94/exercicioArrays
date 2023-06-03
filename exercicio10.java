//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva
// a média aritmética simples dos elementos ímpares armazenados neste vetor.

import java.util.Arrays;

public class exercicio10 {
    public static void main(String[] args) {

        int[] vetorA = new int[]{9,3,1,5,4,8,22,37,14,7};

        System.out.println("O números do vetor é: " + Arrays.toString(vetorA));

        int quantidadeNumImpar = 0;
        int somaImpar = 0;
        for (int elemento : vetorA){
            if (elemento % 2 != 0){
                somaImpar += elemento;
                quantidadeNumImpar++;
            }
        }
        double media = (double)somaImpar/quantidadeNumImpar;
        System.out.println("A média dos impares é: " + media);

        }
    }
