//Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("O número digitado foi " + numero);
        String numeroString = String.valueOf(numero);
        String reversao = "";

        for (int i = (numeroString.length() - 1); i >= 0; i--) {
            reversao += numeroString.charAt(i);
        }

        System.out.println("A ordem inversa do número digitado é: " + reversao);
        }
    }
