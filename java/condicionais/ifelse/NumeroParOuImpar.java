package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class NumeroParOuImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("********** Verificador de número Pares ou Impares **********");
        System.out.println("**********  Digite um número:  **********");
        int numero = leia.nextInt();

        System.out.println("**********  Deseja verificar se o número é Par o Impar?");
        System.out.print("********************  Sim ************************\n");
        System.out.print("********************  Não **************************\n");
        String resposta = leia.next().toUpperCase();

        switch (resposta){
            case "SIM":
                if (numero % 2 == 0){
                    System.out.println("0 número " + numero + " é PAR");
                }else {
                    System.out.println("Informamos que o número " + numero + " é IMPAR");
                }
                break;
            case "NÃO":
                System.out.println("Obrigada pela contribuição!");
                break;
            default:
                System.out.println("Opção incorreta, tente novamente!");
                break;
        }
        leia.close();
    }
}
