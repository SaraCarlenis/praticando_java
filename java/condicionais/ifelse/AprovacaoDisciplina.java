package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("**********  Boletim Escolar Mercurio **********");
        System.out.println("*******  Seja Bemvindo ao site da escola *******");
        System.out.println("Por favor informe seu nome e sobrenome: ");
        String nomeCompleto = leia.nextLine();

        double nota1 = obterNotaValida(leia, "****** Por favor informe a nota do primeiro semestre: ******");
        double nota2 = obterNotaValida(leia, "****** Por favor informe a nota do segundo semestre: ******");
        double nota3 = obterNotaValida(leia, "****** Por favor informe a nota do segundo terceito: ******");
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7.0){
            System.out.printf("Parabens, %s! Você foi aprovado com: %.2f\n", nomeCompleto, media);
        } else if (media >= 5.0) {
            System.out.printf("%s, está de recuperação com: %.2f.\n", nomeCompleto, media);
        }else {
            System.out.printf("%s, está reprovado com: %.2f.\n", nomeCompleto, media);
        }

    leia.close();
    }

    static double obterNotaValida(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10:");
            nota = scanner.nextDouble();
        }

        return nota;
    }
}
