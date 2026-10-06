package br.com.praticando.java.variáveis.e.tipos;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        System.out.println("Gostaria de saber se o número é Par ou Impar?: Sim ou Não");
        String resposta = leia.next();

        if(resposta.equals("Sim")){
            if (numero % 2 == 0){
                System.out.println("O numero " + numero + " é Par");
            }else {
                System.out.println("O número é Impar!");
            }
        }else {
            System.out.println("Obrigada pela resposta!");
        }
    }
}
