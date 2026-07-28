package portfolio.sainttdev.maratonajava.javacore.Dconstrutores.test;

import portfolio.sainttdev.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 1000, "Ação", "Production IG");
        anime.imprime();
    }
}
