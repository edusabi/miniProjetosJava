package Main.test;

import Main.Domain.Boleto;
import Main.Domain.CartaoCredito;
import Main.Domain.DadosPessoais;
import Main.Domain.Pix;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestandoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat formatNumber = new DecimalFormat("0.00");

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu CPF: ");
        String cpf = scanner.nextLine();
        DadosPessoais dadosPessoais = new DadosPessoais(nome, cpf);
        System.out.println(" ");
        System.out.println("Seus dados foram cadastrados!");
        System.out.println("Nome: " + dadosPessoais.getNome() + "\nCPF: " + dadosPessoais.getCpf());
        System.out.println(" ");

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Pagar boleto");
            System.out.println("2 - Pagar com pix");
            System.out.println("3 - Pagar cartão de crédito");
            System.out.println("4 - Fazer depósito");
            System.out.println("5 - Ver saldo");

            System.out.println(" ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    Boleto boleto = new Boleto(dadosPessoais);
                    boleto.processarPagamento();
                    break;
                case 2:
                    Pix pixDebitar = new Pix(dadosPessoais);
                    pixDebitar.processarPagamento();
                    break;
                case 3:
                    CartaoCredito cartaoPagar = new CartaoCredito(dadosPessoais);
                    cartaoPagar.processarPagamento();
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Seu saldo no momento é " + dadosPessoais.getSaldo() + " , quer depositar? \n 1 - sim 2 - nao");
                    int decisao = scanner.nextInt();
                    if(decisao == 1){
                        System.out.println("Quanto deseja depositar?");
                        double saldo = scanner.nextDouble();
                        dadosPessoais.setSaldo(dadosPessoais.getSaldo() + saldo);
                        System.out.println("Seu saldo passou a ser: " + formatNumber.format(dadosPessoais.getSaldo()));
                        System.out.println(" ");
                    };

                case 5:
                    System.out.println("Seu saldo é: " + dadosPessoais.getSaldo());
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            };

        }while (true);
    }
}
