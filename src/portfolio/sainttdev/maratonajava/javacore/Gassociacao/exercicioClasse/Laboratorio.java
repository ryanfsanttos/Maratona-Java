package portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse;

public class Laboratorio {
    private String nome;
    private char bloco;

    public Laboratorio(String nome, char bloco) {
        this.nome = nome;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getBloco() {
        return bloco;
    }

    public void setBloco(char bloco) {
        this.bloco = bloco;
    }
}
