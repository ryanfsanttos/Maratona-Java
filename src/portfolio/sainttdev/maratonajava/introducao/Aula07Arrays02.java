package portfolio.sainttdev.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Trunks";
        nomes[3] = "Goten";

        for (int i = 0; 0 < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
