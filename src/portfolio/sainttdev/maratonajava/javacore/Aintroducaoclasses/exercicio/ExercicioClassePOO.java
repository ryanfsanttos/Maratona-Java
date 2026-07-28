package portfolio.sainttdev.maratonajava.javacore.Aintroducaoclasses.exercicio;

import portfolio.sainttdev.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioClassePOO {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.Nome = "Mitsubishi";
        carro1.Modelo = "Eclipse";
        carro1.Ano = 1995;

        Carro carro2 = new Carro();
        carro2.Nome = "Toyota";
        carro2.Modelo = "Corolla";
        carro2.Ano = 2026;

        // Referência para o mesmo objeto
        carro1 = carro2;

        System.out.println("O primeiro veículo é: " +carro1.Nome+ " " +carro1.Modelo+ " " +carro1.Ano);
        System.out.println("O segundo veículo é: " +carro2.Nome+ " " +carro2.Modelo+ " " +carro2.Ano);

    }
}
