package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class ComparaDoisNumeros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("*********** Descobrindo o número maior ***********");
        System.out.println("Digite o primeiro número: ");
        int num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leia.nextInt();

        if(num1 > num2){
            System.out.printf("O maior número é: %d", num1);
        }else if (num2 > num1){
            System.out.printf("O maior número é: %d", num2);
        }else {
            System.out.println("Os números são iguais!");
        }
    }
}
