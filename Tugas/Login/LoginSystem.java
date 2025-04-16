import java.util.Scanner;

public class LoginSystem {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "ADMIN123", "admin", "111");
        Mahasiswa mahasiswa = new Mahasiswa("Keysa", "202410370110140");

        while (true) {
            System.out.println("\n====================================");
            System.out.println("          SISTEM LOGIN");
            System.out.println("====================================");
            System.out.println("Pilih Login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("====================================");
            System.out.print("Masukkan Pilihan: ");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    loginAdmin(admin);
                    break;
                case 2:
                    loginMahasiswa(mahasiswa);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem login.");
                    System.exit(0);
                default:
                    System.out.println("\n⚠ Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static void loginAdmin(Admin admin) {
        System.out.println("\n------------------------------------");
        System.out.println("             LOGIN ADMIN");
        System.out.println("------------------------------------");
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        if (admin.login(username, password)) {
            System.out.println("\n====================================");
            System.out.println("      LOGIN ADMIN BERHASIL!");
            System.out.println("====================================");
            admin.displayInfo();
            System.out.println("====================================\n");
        } else {
            System.out.println("\n⚠ Login gagal! Username atau password salah.\n");
        }
    }

    private static void loginMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("\n------------------------------------");
        System.out.println("          LOGIN MAHASISWA");
        System.out.println("------------------------------------");
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        if (mahasiswa.login(nama, nim)) {
            System.out.println("\n====================================");
            System.out.println("    LOGIN MAHASISWA BERHASIL!");
            System.out.println("====================================");
            mahasiswa.displayInfo();
            System.out.println("====================================\n");
        } else {
            System.out.println("\n⚠ Login gagal! Nama atau NIM salah.\n");
        }
    }
}