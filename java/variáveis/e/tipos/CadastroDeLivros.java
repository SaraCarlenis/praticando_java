package br.com.praticando.java.variáveis.e.tipos;

import java.util.Scanner;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String livro;
        String autor;
        int numeroDePaginas;
        double precoDoLivro;
        char categoria = 'F';
        String descricaoCategoria;

        System.out.println("Digite o nome do livro: ");
        livro = leia.nextLine();

        System.out.println("Digite o nome do autor: ");
        autor = leia.nextLine();

        System.out.println("Digite o número de páginas: ");
        numeroDePaginas = leia.nextInt();

        System.out.println("Digite o preço do livro: ");
        precoDoLivro = leia.nextDouble();

            System.out.println("******* Por favor selecione a categoria correta: ********");
            System.out.println("*********************************************************");
            System.out.println("************** Categorias disponiveis: ******************");
            System.out.println("****************      F - Ficção       ******************");
            System.out.println("****************      N - Não-ficção   ******************");
            System.out.println("****************      T - Tecnologia   ******************");
            System.out.println("****************      H - História     ******************");

            System.out.println("Escolha a categoria correta: ");

        categoria = leia.next().charAt(0);

        if(categoria == 'F'){
            descricaoCategoria = "Ficção";
            System.out.println("Você acabou de escolher a opção: " + descricaoCategoria);
        }else if (categoria == 'N'){
            descricaoCategoria = "Não-ficção";
            System.out.println("Você acabou de escolher a opção: " + descricaoCategoria);
        } else if (categoria == 'T') {
            descricaoCategoria = "Tecnologia";
            System.out.println("Você acabou de escolher a opção: " + descricaoCategoria);
        }else if (categoria == 'H'){
            descricaoCategoria = "Historia";
            System.out.println("Você acabou de escolher a opção: " + descricaoCategoria);
        }else {

        descricaoCategoria = "Categoria inválida";
        System.out.println("Categoria inválida!");

    }

        System.out.println(
                "O resultado final do livro é: \nLivro: " + livro + "\nAutor: " + autor
                + "\nNúmero de Páginas: " + numeroDePaginas + "\nPreço do Livro: " + precoDoLivro
                + "\nCategoria: " + categoria + "\nDescrição: " + descricaoCategoria
        );

        leia.close();

    }
}
