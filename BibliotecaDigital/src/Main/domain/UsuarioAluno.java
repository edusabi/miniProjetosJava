package Main.domain;

public class UsuarioAluno extends Usuario{
    private String serie;

    public UsuarioAluno(String nome, int idade, String serie) {
        super(nome, idade);
        this.serie = serie;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Serie: " + this.serie);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}