package portfolio.sainttdev.maratonajava.javacore.Hheranca.test;

import portfolio.sainttdev.maratonajava.javacore.Hheranca.dominio.Endereco;
import portfolio.sainttdev.maratonajava.javacore.Hheranca.dominio.Funcionario;
import portfolio.sainttdev.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Doido do Centro");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Mark Zukemberg");
        funcionario.setCpf("55555");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(95.628);

        System.out.println("-----------");

        funcionario.imprime();
    }
}
