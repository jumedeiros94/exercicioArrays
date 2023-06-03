//Crie um programa para exibir todos os inteiros dentro do intervalo
// 100-150 cuja soma de todos os dígitos é um número par.

public class exercicio08 {
    public static void main(String[] args) {

        int numero = 100;


            for (int i = numero; i <=150; i++){

                int unidade = (i % 10);
                int dezena = (i % 100)/10;
                int centena = (i /100);

                int somaNum = (unidade + dezena + centena);

                if (somaNum % 2 == 0){
                    System.out.println(i + "A soma dos digitos é: " + somaNum);
                }

            }






    }
}
