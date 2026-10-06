package br.com.praticando.java.variáveis.e.tipos;

import java.util.Scanner;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = leia.nextLine();

        System.out.println("Digite o valor do produto:");
        double preco = leia.nextDouble();

        if (preco <= 50){
            System.out.printf("O produto %s está nas categoria de Econômico", nomeProduto);
        }else if (preco > 50.00 && preco <= 200.00){
            System.out.printf("O produto %s está na categoria de Intermediário", nomeProduto);
        }else {
            System.out.printf("O produto %s está na categoria Premium", nomeProduto);
        }
    }
}
