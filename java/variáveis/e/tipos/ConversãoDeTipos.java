package br.com.praticando.java.variáveis.e.tipos;

public class ConversãoDeTipos {
    public static void main(String[] args) {
        double valorEstoque = 19.5;

        //Para converter um double para int, utilizamos o casting
        int valorAtualizado = (int) valorEstoque; //O casting não arredonda o número, ele simplesmente corta a parte decimal.
        System.out.println("O valor inteiro do produto é: " + valorAtualizado);
    }
}
