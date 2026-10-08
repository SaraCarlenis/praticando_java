package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class VerificaDoacaoSangue {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("***** Centro de Doação de Sangue *****");
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = leia.nextLine();
        System.out.println("Qual é sua idade? ");
        int idade = leia.nextInt();
        System.out.println("Digite seu peso atual: ");
        double pesoAtual = leia.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = pesoAtual > 50;

        if (idadeValida && pesoValido){
            System.out.println("O doador é compatível para doação de sangue.");
        }else {
            System.out.println("Doador não é compatível para doar sangue. Motivo: ");
            if (!idadeValida){
                System.out.println("O doador deve ter entre 18 e 65 anos.");
            }if (!pesoValido){
                System.out.println("Deve pessar mais de 50kg.");
            }
        }
        leia.close();
    }
}
