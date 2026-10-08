package br.com.praticando.java.condicionais.ifelse;
import java.util.Scanner;

public class DescontoCompras {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double totalCompra = 0;
        String resposta;
        double subtotal = 0;

        do {

            System.out.println("******** SuperMercado IVA ********");
            System.out.println("Produtos disponiveís na loja -> ");
            System.out.println("**** Digite a opção desejada ****");
            System.out.println("***** 1- Arroz  - R$ 25,20 *****");
            System.out.println("***** 2- Frango - R$40,59 *****");
            System.out.println("***** 3- Açucar - R$5,00 *****");
            System.out.println("***** 4- Manga  - R$ 8,99 *****");
            System.out.println("***** 5- Cafe   - R$15,00 *****");
            System.out.println("***** 6- Sair *****");

            System.out.println("Escolha uma opção: ");
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Por favor digite as unidades que deseja comprar: ");
                    int quantidadeArroz = leia.nextInt();
                    subtotal = quantidadeArroz * 25.20;
                    totalCompra += subtotal;

                    System.out.printf("Arroz adicionado! " +
                            "\nSubtotal: R$ %.2f", subtotal);
                    break;
                case 2:
                    System.out.println("Por favor digite as unidades que deseja comprar: ");
                    int quantidadeFrango = leia.nextInt();
                    subtotal = quantidadeFrango * 40.59;
                    totalCompra += subtotal;
                    System.out.printf("Frango adicionado! " +
                            "\nSubtotal: R$ %.2f", totalCompra);
                    break;
                case 3:
                    System.out.println("Por favor digite as unidades que deseja comprar: ");
                    int quantidadeAcucar = leia.nextInt();
                    subtotal = quantidadeAcucar * 5.00;
                    totalCompra += subtotal;
                    System.out.printf("Açucar adicionada!" +
                            "\nSubtotal: R$ %.2f", totalCompra);
                    break;
                case 4:
                    System.out.println("Por favor digite as unidades que deseja comprar: ");
                    int quantidadeManga = leia.nextInt();
                    subtotal += quantidadeManga * 8.99;
                    totalCompra += subtotal;
                    System.out.printf("Manga adicionada!" +
                            "\nSubtotal: R$ %.2f", totalCompra);
                    break;
                case 5:
                    System.out.println("Por favor digite as unidades que deseja comprar: ");
                    int quantidadeCafe = leia.nextInt();
                    subtotal += quantidadeCafe * 15.00;
                    totalCompra = subtotal;
                    System.out.printf("Cafe adicionado!" +
                            "\nSubtotal: R$ %.2f", totalCompra);
                    break;
                case 6:
                    System.out.println("Volte sempre!");
                    resposta = "não";
                    continue;

                default:
                    System.out.println("Opção invalida, tente novamente!");
            }

            System.out.printf("\nTotal da compra até agora: %.2f\n", totalCompra);

            System.out.printf("Deseja continuar? (Sim/Não) ");
            resposta = leia.next();

        } while (resposta.equalsIgnoreCase("Sim"));

        //calculando o desconto
        if (totalCompra >= 100.00){
            double desconto = totalCompra * 0.10;
            double totalDesconto = totalCompra - desconto;

            System.out.printf("\nCompra acima de R$ 100,00!\n");
            System.out.printf("Desconto de 10%%: R$ %.2f%n", desconto);
        } else {
            System.out.printf("%nValor da compra: R$ %.2f%n", totalCompra);
            System.out.println("Você não recebeu desconto.");
        }
        leia.close();
    }
}
