package main.domain;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, double capacidadeCarga) {
        super(placa, marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("capacidade da carga: " + capacidadeCarga);
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
