package portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse;

public class Orientador {
    private String nome;
    private String especialidade;
    private Projeto[] projetos;

    public Orientador(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Orientador(String nome, String especialidade, Projeto[] projetos) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.projetos = projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Projeto[] getProjetos() {
        return projetos;
    }

    public void setProjetos(Projeto[] projetos) {
        this.projetos = projetos;
    }
}
