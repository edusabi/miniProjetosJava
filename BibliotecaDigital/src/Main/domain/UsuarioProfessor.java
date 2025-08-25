package Main.domain;

public class UsuarioProfessor extends Usuario {

    private String materia;

    public UsuarioProfessor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matéria: " + this.materia);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
