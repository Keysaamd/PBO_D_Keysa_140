package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions{
    private static Scanner input = new Scanner(System.in);

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayAppMenu() {
        int pilihan;
        do {
            System.out.println("\n------------------------------------");
            System.out.println("             MENU MAHASISWA");
            System.out.println("------------------------------------");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("3. Keluar");
            System.out.println("Pilihan: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 3:
                    System.out.println("Logout berhasil");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 3);
    }

    @Override
    public void reportItem() {
        System.out.println("\n------------------------------------");
        System.out.println("             LAPORAN BARANG");
        System.out.println("------------------------------------");
        System.out.print("Nama Barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Deskripsi Barang:");
        String deskripsi = input.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = input.nextLine();


        System.out.println("\nLaporan berhasil disimpan");
        System.out.println("Barang: "+ namaBarang);
        System.out.println("Deskripsi: "+ deskripsi);
        System.out.println("Lokasi: "+ lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">>Fitur Lihat Laporan Belum Tersedia<<");
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Mahasiswa");
        System.out.println("Login berhasil sebagai mahasiswa!");
    }
}