package Main.Domain;

import java.util.Scanner;

public class CartaoCredito implements ProcessoPagamento{
    Scanner scanner = new Scanner(System.in);
    private DadosPessoais dados;

    public CartaoCredito(DadosPessoais dados) {
        this.dados = dados;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Qual o valor da fatura do cartão?");
        double valor = scanner.nextDouble();
        dados.debitarSaldo(valor);
    }

}