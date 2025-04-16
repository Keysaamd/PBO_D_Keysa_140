package Modul_3.Praktek;

public class MobilListrik extends Mobil{
    int ukuranBatre;

    public MobilListrik(String namaMobil, int tahunMobil, int ukuranBatre) {
        super(namaMobil, tahunMobil);
        this.ukuranBatre = ukuranBatre;

        System.out.println("Ukuran batre: " + this.ukuranBatre);
    }
}
