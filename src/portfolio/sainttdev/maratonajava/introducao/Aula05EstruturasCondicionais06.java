package portfolio.sainttdev.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int dia = 3;

        switch (dia){
            case 1:
                System.out.println("DOM - Final de Semana");
                break;
            case 2:
                System.out.println("SEG - Dia útil");
                break;
            case 3:
                System.out.println("TER - Dia útil");
                break;
            case 4:
                System.out.println("QUA - Dia útil");
                break;
            case 5:
                System.out.println("QUI - Dia útil");
                break;
            case 6:
                System.out.println("SEX - Dia útil");
                break;
            case 7:
                System.out.println("SAB - Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
