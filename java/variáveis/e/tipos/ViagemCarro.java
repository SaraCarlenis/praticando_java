package br.com.praticando.java.variáveis.e.tipos;

import java.util.Scanner;

public class ViagemCarro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o consumo medio por km do carro: ");
        double consumoMedio = leia.nextDouble();

        System.out.println("Qual é a capacidade do tanque: ");
        double capacidadeTanque = leia.nextDouble();

        System.out.println("Por favor informe o combustivel atual do carro: ");
        double combustivelAtual = leia.nextDouble();

        System.out.println("Qual é a distanciada viagem: ");
        double distanciaViagem = leia.nextDouble();

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        if (autonomiaAtual > distanciaViagem ){
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }else {
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }

    }
}
