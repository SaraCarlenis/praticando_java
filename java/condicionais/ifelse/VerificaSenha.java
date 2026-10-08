package br.com.praticando.java.condicionais.ifelse;

import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("******** Sistema Tech ********");
        System.out.println("******** Por favor digite a senha do acesso ADM: ********");
        String senha = leia.next();

        String senhaADM = "ADM1234";

        if (senha.equals(senhaADM)){
            System.out.println("Usuário ADM logado com sucesso!");
        } else {
            System.out.println("Somente usuário ADM tem acesso ao sistema.");
        }
        leia.close();
    }
}
