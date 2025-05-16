package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username;
    private String password;

    private Scanner input = new Scanner(System.in);

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayAppMenu() {
        int pilihan;
        do {
            System.out.println("\n------------------------------------");
            System.out.println("             MENU ADMIN");
            System.out.println("------------------------------------");
            System.out.println("1. Kelola Laporkan Barang ");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("Pilihan: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
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
    public void manageItems() {
        System.out.println(">>Fitur Kelola Barang Belum Tersedia<<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">>Fitur Kelola Mahasiswa Belum Tersedia<<");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Admin");
        System.out.println("Login berhasil sebagai admin!");
    }
}