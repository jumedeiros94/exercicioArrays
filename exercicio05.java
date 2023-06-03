//Criar um programa que calcule a média de salários de uma empresa,
// pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);
                DecimalFormat formatador = new DecimalFormat("#,##0.00");

                Map<String,Double> quadroFuncionarios = new HashMap<>();

                System.out.println("[--Média salarial de seus funcionários --]");
                System.out.println("Digite quantos funcionários vão ser cadastrados: ");
                int numFunc = entrada.nextInt();


                double somaSalario = 0;
                double mediaSalarial = 0;

                for (int i = 0; i < numFunc;i++){
                    System.out.println("Digite o nome do " + ( i + 1 ) + "ª" + " funcionário: ");
                    String nomeColaborador = entrada.next();
                    System.out.println("Digite o salário do " + ( i + 1 ) + "ª" + " funcionário: ");
                    double salarioColaborador = entrada.nextDouble();
                    quadroFuncionarios.put(nomeColaborador,salarioColaborador);
                    somaSalario += salarioColaborador;
                    mediaSalarial = somaSalario / numFunc;
                }

                System.out.println("A grade de funcionários é: " + quadroFuncionarios);
                System.out.println("A média salarial é: R$ " + formatador.format(mediaSalarial));


    }
}
