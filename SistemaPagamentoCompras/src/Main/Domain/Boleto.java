package Main.Domain;

import java.util.Scanner;

public class Boleto implements ProcessoPagamento{
    Scanner scanner = new Scanner(System.in);

    private DadosPessoais dados;

    public Boleto(DadosPessoais dados) {
        this.dados = dados;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Qual o valor do boleto a ser pago?");
        double valor = scanner.nextDouble();
        dados.debitarSaldo(valor);
    }
}
