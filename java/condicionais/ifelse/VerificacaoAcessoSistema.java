package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class VerificacaoAcessoSistema {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codAcessoCorreto = 2023;
        int nivelPermissao1 = 1;
        int nivelPermissao2 = 3;

        System.out.println("****** Sistema de Segunraça Tech ******");
        System.out.println("****** Digite o código de acesso: ******");
        int codigoDigitado = leia.nextInt();
        System.out.println("Digite seu nível de permissão: ");
        int nivelPermissao = leia.nextInt();

        boolean codigoValido = codAcessoCorreto == codigoDigitado;
        boolean nivelValido = nivelPermissao >= nivelPermissao1 && nivelPermissao <= nivelPermissao2;

        if (codigoValido && nivelValido){
            System.out.println("Acesso permitido. Seja bemvindo ao sistema!");
        }else {
            System.out.println("Acesso negado. Motivo: ");
            if (!codigoValido){
                System.out.println("Código de acesso incorreto!");
            }
            if (!nivelValido){
                System.out.println("Nível de permissão inválido.");
            }
        }
    }
}
