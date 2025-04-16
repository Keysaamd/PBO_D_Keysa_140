// Admin.java (subclass dari User)
public class Admin extends User {
    private String username;
    private String password;

    // Constructor menggunakan super
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Override login method dari admin
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Admin");
        System.out.println("Login berhasil sebagai Admin!");
    }
}