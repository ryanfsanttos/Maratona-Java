package portfolio.sainttdev.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        // !

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Não pode");
        }
        boolean c = false;
        if(c == false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do IF");
    }
}
