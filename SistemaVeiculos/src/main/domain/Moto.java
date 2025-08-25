package main.domain;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int cilindradas) {
        super(placa, marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindradas: " + cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
