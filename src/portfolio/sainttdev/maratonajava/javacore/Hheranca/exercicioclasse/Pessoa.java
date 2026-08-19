package portfolio.sainttdev.maratonajava.javacore.Hheranca.exercicioclasse;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.idade+ " anos");
    }
    public Pessoa(String nome, int idade, String cpf) {
        this(nome);
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
