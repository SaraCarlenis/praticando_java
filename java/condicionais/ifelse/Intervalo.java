package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        //Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente
        // está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
        //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
        Scanner leia = new Scanner(System.in);

        System.out.println("***** Banco Banesco *****");
        System.out.println("Deseja solicitar um empréstimo? (Sim/Não)");
        String resposta = leia.next();

        if(resposta.equalsIgnoreCase("Sim")){
            System.out.println("Por favor digite o valor do empréstimo: ");
            double valorSolicitado = leia.nextDouble();

            if (valorSolicitado >= 1000 && valorSolicitado <= 5000){
                System.out.printf("O valor %.2f está dentro do intervalo permitido para empréstimo.", valorSolicitado);
            }else {
                System.out.printf("O valor %.2f não está dentro do intervalo permitido para empréstimo.", valorSolicitado);
            }
        }else {
            System.out.println("Volte sempre!");
        }
        leia.close();
    }
}
