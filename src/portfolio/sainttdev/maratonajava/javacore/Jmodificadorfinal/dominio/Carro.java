package portfolio.sainttdev.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    // Constantes tem convenção própria (upper case/caps lock)
    public static final double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
