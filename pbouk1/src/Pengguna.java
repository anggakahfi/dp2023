// Kelas induk kedua
public class Pengguna {
    private String username;  // Encapsulasi
    private String email;

    public Pengguna(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;  // Getter
    }

    public void setUsername(String username) {
        this.username = username;  // Setter
    }

    public String getEmail() {
        return email;  // Getter
    }

    public void setEmail(String email) {
        this.email = email;  // Setter
    }

    public void infoPengguna() {
        System.out.println("Username: " + username + ", Email: " + email);
    }
}
