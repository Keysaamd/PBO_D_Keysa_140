package com.praktikum.users;

//mengubah class user menjadi abstract class
public abstract class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    //mengubah login menjadi abstract
    public abstract boolean login(String input1, String input2);
    //menambahkan method abstract baru
    public abstract void displayAppMenu();

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}