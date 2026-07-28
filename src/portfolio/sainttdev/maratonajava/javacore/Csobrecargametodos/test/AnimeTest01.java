package portfolio.sainttdev.maratonajava.javacore.Csobrecargametodos.test;

import portfolio.sainttdev.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.init("Dragon Ball", "TV", 500, "Ação");
        anime.init("Dragon Ball ", "TV", 1000, "Ação");
        anime.imprime();
    }
}
