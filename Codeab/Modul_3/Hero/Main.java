package Modul_3.Hero;

public class Main {
    public static void main(String[] args) {
        Spiderman spiderman = new Spiderman();
        Superman superman = new Superman();
        Deadpool deadpool = new Deadpool();

        spiderman.setName("Tobey maguaire");
        superman.setName("Cristoper");
        deadpool.setName("Ryan Reynolds");

        spiderman.memanjat();
        superman.terbang();
        deadpool.menyembuhkan();

        Spiderman spiderman2 = new Spiderman();
    }
}
