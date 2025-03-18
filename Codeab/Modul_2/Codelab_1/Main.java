package Modul_2.Codelab_1;

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek NamaHewan1
        NamaHewan NamaHewan1 = new NamaHewan();
        NamaHewan1.nama = "Ikan";
        NamaHewan1.jenis = "Vertebrata Poikilotermik";
        NamaHewan1.suara = "Blububblubub\n";

        // Membuat objek NamaHewan2
        NamaHewan NamaHewan2 = new NamaHewan();
        NamaHewan2.nama = "Anjing";
        NamaHewan2.jenis = "Mamalia";
        NamaHewan2.suara = "Woof-Woof!!";

        // Menampilkan informasi NamaHewan1 dan NamaHewan2
        NamaHewan1.tampilkanInfo();
        NamaHewan2.tampilkanInfo();
    }
}
