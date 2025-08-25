package Main.domain;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private String dataInicio;
    private String dataFim;

    public Emprestimo(Livro livro, Usuario usuario, String dataInicio, String dataFim) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void exibirInfoEmprestimo() {
        System.out.println("Livro emprestado para: " + usuario.getNome() + "\n" + "Idade: " + usuario.getIdade());

        if(usuario instanceof UsuarioAluno){
            UsuarioAluno aluno = (UsuarioAluno) usuario;
            System.out.println("Serie: " + aluno.getSerie());
        } else if (usuario instanceof UsuarioProfessor) {
            UsuarioProfessor professor = (UsuarioProfessor) usuario;
            System.out.println("Matéria: " + professor.getMateria());
        }

        livro.exibirInfoLivro();
        System.out.println("Data de inicio: " + dataInicio);
        System.out.println("Data fim: " + dataFim);

    }
}
