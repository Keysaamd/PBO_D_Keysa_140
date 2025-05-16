package Modul_5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ManajemenStok {
    private static ArrayList<Barang> daftarBarang = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        daftarBarang.add(new Barang("Laptop", 50));
        daftarBarang.add(new Barang("Hp", 100));
        daftarBarang.add(new Barang("Tablet", 30));

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = bacaInputAngka("Pilih opsi: ");

            switch (pilihan) {
                case 1:
                    tambahBarangBaru();
                    break;
                case 2:
                    tampilkanSemuaBarang();
                    break;
                case 3:
                    kurangiStokBarang();
                    break;
                case 0:
                    System.out.println("Terima kasih! Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n===== Menu Manajemen Stok =====");
        System.out.println("1. Tambah Barang Baru");
        System.out.println("2. Tampilkan Semua Barang");
        System.out.println("3. Kurangi Stok Barang");
        System.out.println("0. Keluar");
    }

    private static void tambahBarangBaru() {
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan stok awal: ");
        try {
            int stokAwal = scanner.nextInt();
            scanner.nextLine();

            daftarBarang.add(new Barang(namaBarang, stokAwal));
            System.out.println("Barang '" + namaBarang + "' berhasil ditambahkan.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input stok harus berupa angka!");
            scanner.nextLine();
        }
    }

    private static void tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Stok barang kosong.");
            return;
        }

        System.out.println("\n--- Daftar Barang ---");
        Iterator<Barang> iterator = daftarBarang.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Barang barang = iterator.next();
            System.out.println(index + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
            index++;
        }
    }

    private static void kurangiStokBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Stok barang kosong.");
            return;
        }

        System.out.println("\n--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println(i + ". " + daftarBarang.get(i).getNama() + " (Stok: " + daftarBarang.get(i).getStok() + ")");
        }

        try {
            System.out.print("Masukkan nomor indeks barang: ");
            int indeks = scanner.nextInt();

            if (indeks < 0 || indeks >= daftarBarang.size()) {
                System.out.println("Error: Indeks tidak valid!");
                return;
            }

            System.out.print("Masukkan jumlah stok yang akan diambil: ");
            int jumlahDiambil = scanner.nextInt();
            scanner.nextLine();

            Barang barang = daftarBarang.get(indeks);

            if (jumlahDiambil > barang.getStok()) {
                throw new StokTidakCukupException("Stok untuk " + barang.getNama() + " hanya tersisa " + barang.getStok());
            }

            barang.setStok(barang.getStok() - jumlahDiambil);
            System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " + barang.getStok());

        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
            scanner.nextLine();
        } catch (StokTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int bacaInputAngka(String pesan) {
        System.out.print(pesan);
        try {
            int input = scanner.nextInt();
            scanner.nextLine();
            return input;
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
            scanner.nextLine();
            return -1;
        }
    }
}