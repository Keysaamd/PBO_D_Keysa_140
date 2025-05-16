package Modul_4.Output;

import Modul_4.Perpus.Anggota;
import Modul_4.Perpus.Buku;
import Modul_4.Perpus.Fiksi;
import Modul_4.Perpus.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Buku revolusi = new NonFiksi("Revolusi 1945", "Benedict Anderson", "Sejarah & Politik");
        Buku lautBercerita = new Fiksi("Laut Bercerita", "Leila S. Chudori", "Fantasi");

        Anggota keysa = new Anggota("Keysa Amanda", "202410370110140");
        Anggota salsa = new Anggota("Salsabila", "202410370110041");

        System.out.println("=== INFORMASI BUKU ===");
        revolusi.displayInfo();
        System.out.println();
        lautBercerita.displayInfo();
        System.out.println("\n=== DATA ANGGOTA ===");

        System.out.print("• ");
        keysa.displayInfo();
        System.out.print("• ");
        salsa.displayInfo();

        System.out.println("\n=== PROSES PEMINJAMAN ===");
        System.out.println("[Keysa Amanda] ");
        System.out.print("  - ");
        keysa.pinjamBuku("Revolusi 1945");

        System.out.println("\n[Salsabila] ");
        System.out.print("  - ");
        salsa.pinjamBuku("Laut Bercerita", 7);

        System.out.println("\n=== PROSES PENGEMBALIAN ===");
        System.out.println("[Keysa Amanda] ");
        System.out.print("  - ");
        keysa.kembalikanBuku("Revolusi 1945");

        System.out.println("\n[Salsabila] ");
        System.out.print("  - ");
        salsa.kembalikanBuku("Laut Bercerita");

        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}