package br.com.praticando.java.variáveis.e.tipos;

import java.util.Scanner;

public class CalculaTemperatura {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite quantos graus estamos hoje: ");
        int celsius = leia.nextInt();

        double fahrenheit = (celsius * 9 / 5.0) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
