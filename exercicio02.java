//Escreva um programa para inserir um elemento (posição específica) em uma lista.

import java.util.ArrayList;

public class exercicio02 {
    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>(20);
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Roxo");

        System.out.println("Os elementos são " + cores);

        cores.add(3, "Violeta");

        System.out.println("Inseri Violeta na posição 3");
        System.out.println(cores);

     }
    }
