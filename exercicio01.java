//Escreva um programa para remover um elemento específico de uma lista.

import java.util.ArrayList;

public class exercicio01 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
                numeros.add(1);
                numeros.add(2);
                numeros.add(3);

        System.out.println(numeros);

                numeros.remove(1);

        System.out.println(numeros);

    }
}
