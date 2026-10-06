package br.com.praticando.java.variáveis.e.tipos;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("************* Casa de Cambio DolarToday **************\n");
        System.out.print("*********** Gostaria de fazer uma cotação ***********\n");
        System.out.print("******************** 1 - Sim ************************\n");
        System.out.print("******************** 2 - Não **************************\n");

        int opcao = leia.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o valor em reais: ");
                double valorReais = leia.nextDouble();

                double taxaCambio = 5.25;
                double conversao = valorReais / taxaCambio;

                System.out.printf("O valor em dólares é: US$ %.2f%n", conversao);
                break;
            case 2:
                System.out.println("Volte sempre!");
                break;
            default:
                System.out.println("Opção inválida! Digite 1 ou 2.");
        }
        leia.close();
    }
}
