// Kelas anak keempat yang menginduk ke Pengguna
class Pelanggan extends Pengguna {
    private String alamat;

    public Pelanggan(String username, String email, String alamat) {
        super(username, email);  // Memanggil konstruktor induk
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;  // Getter
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;  // Setter
    }

    @Override
    public void infoPengguna() {
        super.infoPengguna();  // Memanggil metode induk
        System.out.println("Alamat: " + alamat);
    }
}
