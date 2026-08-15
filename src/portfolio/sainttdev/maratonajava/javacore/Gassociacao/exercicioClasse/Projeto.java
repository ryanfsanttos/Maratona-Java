package portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse;

public class Projeto {
    private String titulo;
    private Estudante[] estudantes;
    private Orientador orientador;
    private Laboratorio laboratorio;


    public Projeto(String titulo, Estudante[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public void imprime() {
        System.out.println("Projeto: " + this.getTitulo());
        if (orientador != null) {
            System.out.println("Orientador: " + this.orientador.getNome());
        }
        if (laboratorio != null) {
            System.out.println("Laboratório: " + this.laboratorio.getNome());
        }

        System.out.println("Estudantes:");

        if(this.estudantes == null) {
            return;
        }
        for (Estudante estudante : this.estudantes) {
            System.out.println(estudante.getNome() + " -- " + estudante.getIdade() + " Anos ");
        }
    }

    public Projeto(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
