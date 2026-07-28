package portfolio.sainttdev.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main() {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.50D;
        float salarioFloat = (float) 2500.852D;
        byte idadeByte = 10;
        short idadeShort = 32000 ;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Trunks";

        System.out.println("A idade é " +idade);
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é "+nome+" :)");
        System.out.println("nome2");
    }
}
