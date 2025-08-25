package Main.domain;

import java.util.ArrayList;
import java.util.List;

public class BancoDeLivros {

    public static List<Livro> getLivros() {
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        livros.add(new Livro("Moby Dick", "Herman Melville", 1851));
        livros.add(new Livro("Crime e Castigo", "Fiódor Dostoiévski", 1866));
        livros.add(new Livro("Orgulho e Preconceito", "Jane Austen", 1813));
        livros.add(new Livro("A Metamorfose", "Franz Kafka", 1915));
        livros.add(new Livro("A Guerra dos Mundos", "H.G. Wells", 1898));

        livros.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));
        livros.add(new Livro("Capitães da Areia", "Jorge Amado", 1937));
        livros.add(new Livro("Iracema", "José de Alencar", 1865));
        livros.add(new Livro("O Cortiço", "Aluísio Azevedo", 1890));
        livros.add(new Livro("Senhora", "José de Alencar", 1875));
        livros.add(new Livro("Grande Sertão: Veredas", "Guimarães Rosa", 1956));
        livros.add(new Livro("Vidas Secas", "Graciliano Ramos", 1938));
        livros.add(new Livro("O Guarani", "José de Alencar", 1857));
        livros.add(new Livro("Marília de Dirceu", "Tomás Antônio Gonzaga", 1792));
        livros.add(new Livro("Lira dos Vinte Anos", "Álvares de Azevedo", 1853));

        livros.add(new Livro("Quincas Borba", "Machado de Assis", 1891));
        livros.add(new Livro("Helena", "Machado de Assis", 1876));
        livros.add(new Livro("O Alienista", "Machado de Assis", 1882));
        livros.add(new Livro("Triste Fim de Policarpo Quaresma", "Lima Barreto", 1915));
        livros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
        livros.add(new Livro("O Amor nos Tempos do Cólera", "Gabriel García Márquez", 1985));
        livros.add(new Livro("O Nome da Rosa", "Umberto Eco", 1980));
        livros.add(new Livro("Ensaio sobre a Cegueira", "José Saramago", 1995));
        livros.add(new Livro("Memorial do Convento", "José Saramago", 1982));
        livros.add(new Livro("A Máquina do Tempo", "H.G. Wells", 1895));

        livros.add(new Livro("Os Miseráveis", "Victor Hugo", 1862));
        livros.add(new Livro("O Conde de Monte Cristo", "Alexandre Dumas", 1844));
        livros.add(new Livro("Os Três Mosqueteiros", "Alexandre Dumas", 1844));
        livros.add(new Livro("Viagem ao Centro da Terra", "Júlio Verne", 1864));
        livros.add(new Livro("Vinte Mil Léguas Submarinas", "Júlio Verne", 1870));
        livros.add(new Livro("A Ilha Misteriosa", "Júlio Verne", 1874));
        livros.add(new Livro("O Retrato de Dorian Gray", "Oscar Wilde", 1890));
        livros.add(new Livro("Jane Eyre", "Charlotte Brontë", 1847));
        livros.add(new Livro("O Morro dos Ventos Uivantes", "Emily Brontë", 1847));
        livros.add(new Livro("Drácula", "Bram Stoker", 1897));

        livros.add(new Livro("Frankenstein", "Mary Shelley", 1818));
        livros.add(new Livro("O Médico e o Monstro", "Robert Louis Stevenson", 1886));
        livros.add(new Livro("A Ilha do Tesouro", "Robert Louis Stevenson", 1883));
        livros.add(new Livro("Admirável Mundo Novo", "Aldous Huxley", 1932));
        livros.add(new Livro("Fahrenheit 451", "Ray Bradbury", 1953));
        livros.add(new Livro("O Sol é para Todos", "Harper Lee", 1960));
        livros.add(new Livro("A Menina que Roubava Livros", "Markus Zusak", 2005));
        livros.add(new Livro("O Código Da Vinci", "Dan Brown", 2003));
        livros.add(new Livro("Inferno", "Dan Brown", 2013));
        livros.add(new Livro("O Símbolo Perdido", "Dan Brown", 2009));

        return livros;
    }
}
