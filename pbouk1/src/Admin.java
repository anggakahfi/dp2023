// Kelas anak ketiga yang menginduk ke Pengguna
class Admin extends Pengguna {
    private String levelAkses;

    public Admin(String username, String email, String levelAkses) {
        super(username, email);  // Memanggil konstruktor induk
        this.levelAkses = levelAkses;
    }

    public String getLevelAkses() {
        return levelAkses;  // Getter
    }

    public void setLevelAkses(String levelAkses) {
        this.levelAkses = levelAkses;  // Setter
    }

    @Override
    public void infoPengguna() {
        super.infoPengguna();  // Memanggil metode induk
        System.out.println("Level Akses: " + levelAkses);
    }
}