package Modul_2.Codelab_2;

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1
        Rekening rekening1 = new Rekening();
        rekening1.nomorRekening = "202410370110140";
        rekening1.namaPemilik = "Keysa";
        rekening1.saldo = 500000.0;

        // Membuat objek rekening2
        Rekening rekening2 = new Rekening();
        rekening2.nomorRekening = "202410370110135";
        rekening2.namaPemilik = "Novi";
        rekening2.saldo = 1000000.0;

        // Menampilkan informasi rekening1 dan rekening2
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi setor uang
        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);
        System.out.println();

        // Melakukan transaksi tarik uang
        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);
        System.out.println();

        // Menampilkan informasi rekening1 dan rekening2 setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
