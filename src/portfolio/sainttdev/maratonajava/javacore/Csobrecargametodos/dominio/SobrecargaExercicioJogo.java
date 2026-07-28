package portfolio.sainttdev.maratonajava.javacore.Csobrecargametodos.dominio;

public class SobrecargaExercicioJogo {
    private String nome;
    private String genero;
    private int idadeClassificacao;
    private int ano;
    private String empresa;

    public void inicializacao (String nome, String genero, int idadeClassificacao, int ano){
        this.nome = nome;
        this.genero = genero;
        this.idadeClassificacao = idadeClassificacao;
        this.ano = ano;
    }

    public void inicializacao (String nome, String genero, int idadeClassificacao, int ano, String empresa) {
        this.inicializacao(nome, genero, idadeClassificacao, ano);
        this.empresa = empresa;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.idadeClassificacao);
        System.out.println(this.ano);
        System.out.println(this.empresa);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdadeClassificacao() {
        return idadeClassificacao;
    }

    public void setIdadeClassificacao(int idadeClassificacao) {
        this.idadeClassificacao = idadeClassificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
