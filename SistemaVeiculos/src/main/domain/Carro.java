package main.domain;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String marca, String modelo, int quantidadePortas) {
        super(placa, marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de portas: " + this.quantidadePortas);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
