package Main.Domain;
import java.text.DecimalFormat;


public class DadosPessoais {
    private String nome;
    private String cpf;
//    private String numeroCartao;
    private static double saldo = 0;

    DecimalFormat formatNumber = new DecimalFormat("0.00");

    public DadosPessoais(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
//        this.numeroCartao = numeroCartao;
    }

    public void meusDados(){
        System.out.println(nome);
        System.out.println(cpf);
    }

    public void debitarSaldo(double valor) {
        if (valor <= saldo) {
            System.out.println("Irá ser debitado do seu saldo R$ " + formatNumber.format(valor));
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//    public String getNumeroCartao() {
//        return numeroCartao;
//    }
//
//    public void setNumeroCartao(String numeroCartao) {
//        this.numeroCartao = numeroCartao;
//    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
