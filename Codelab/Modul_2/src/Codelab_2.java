// Kelas Rekening
class Rekening {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println(); // Spasi tambahan
    }

    // Method untuk menyetor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Method untuk menarik uang
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}

// Kelas Codelab_2
public class Codelab_2 {
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
        System.out.println(); // Spasi tambahan

        // Melakukan transaksi tarik uang
        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);
        System.out.println(); // Spasi tambahan

        // Menampilkan informasi rekening1 dan rekening2 setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}




