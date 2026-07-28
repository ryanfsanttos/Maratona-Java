package portfolio.sainttdev.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Santtos";
        String endereco = "Rua Dillimore, 1533";
        double meuSalario = 3500.0;
        String dataDiaDoPagamento = "2026.04.03";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de " +meuSalario+", na data "+dataDiaDoPagamento;
        System.out.println(relatorio);

    }
}
