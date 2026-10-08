package br.com.praticando.java.condicionais.ifelse;

import java.text.Normalizer;
import java.util.Scanner;

public class VerificacaoDiaUtil {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("******** Verificação de dia útil ********");
        System.out.println("Digite o dia da semana:");
        String diaDaSemana = leia.next();

        diaDaSemana = Normalizer
                .normalize(diaDaSemana, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .toLowerCase();

        if (diaDaSemana.equals("segunda") ||
                diaDaSemana.equals("terca") ||
                diaDaSemana.equals("quarta") ||
                diaDaSemana.equals("quinta") ||
                diaDaSemana.equals("sexta")) {

            System.out.printf("\n%s é um dia útil!%n", diaDaSemana);

        } else if (diaDaSemana.equals("sábado") ||
                diaDaSemana.equals("domingo")) {

            System.out.printf("\n%s não é um dia útil.%n", diaDaSemana);

        } else {

            System.out.println("Dia incorreto, tente novamente!");
        }

        leia.close();
    }
}