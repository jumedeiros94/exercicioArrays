//Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

            System.out.print("Digite um número inteiro ");
            int num = entrada.nextInt();

            if (num % 5 == 0) {
                System.out.println(num + " é múltiplo de 5");
            } else {
                System.out.println(num + " não é múltiplo de de 5");
            }

            if (num % 7 == 0) {
                System.out.println(num + " é múltiplo de 7");
            } else {
                System.out.println(num + " não é múltiplo de de 7");
            }
    }
}


