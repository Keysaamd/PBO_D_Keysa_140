// Mahasiswa.java (subclass of User)
public class Mahasiswa extends User {
    // Constructor using super
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override login method for mahasiswa
    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Mahasiswa");
        System.out.println("Login berhasil sebagai Mahasiswa!");
    }
}