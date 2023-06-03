//Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).


import java.util.*;

public class exercicio03 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = entrada.nextInt();

        numeros.add(num1);
        numeros.add(num2);

        System.out.println(numeros);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("A ordem decrescente é: " + numeros);
    }
}
