package portfolio.sainttdev.maratonajava.javacore.Fmodificadorestatico.exercicio;

import portfolio.sainttdev.maratonajava.javacore.Fmodificadorestatico.dominio.Apresentacao;

public class ApresentacaoTest {
    public static void main(String[] args) {
        Apresentacao apresentacao1 = new Apresentacao("Renato Cariani, Júlio Balestrin", 08.11);
        Apresentacao apresentacao2 = new Apresentacao("Ramon Dino, Bitelo Natural", 09.11);


        apresentacao1.setData(10.12);

        // Devido a utilização do 'static' no idadeMinima, o valor que for inserido pelo 'setter' modificará todos os objetos que possuem tal atributo.
        apresentacao2.setIdadeMinima(12);
        apresentacao2.setData(13.12);


        apresentacao1.imprime();
        apresentacao2.imprime();
    }
}
