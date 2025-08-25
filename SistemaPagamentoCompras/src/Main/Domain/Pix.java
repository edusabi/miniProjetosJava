package Main.Domain;

import java.util.Scanner;

public class Pix implements ProcessoPagamento{
    Scanner scanner = new Scanner(System.in);
    private DadosPessoais dados;

    public Pix(DadosPessoais dados) {
        this.dados = dados;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Qual o valor do pix a ser enviado?");
        double valor = scanner.nextDouble();
        dados.debitarSaldo(valor);
    }
}
