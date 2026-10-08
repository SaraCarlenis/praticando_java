package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class VerificacaoDeTriangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int lado1 = leia.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = leia.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = leia.nextInt();

        if (lado1 + lado3 > lado3 &&
            lado1 + lado3 > lado2 &&
            lado2 + lado3 > lado3){
            System.out.println("Os lados podem formar um triângulo.");
        }else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        leia.close();
    }
}
