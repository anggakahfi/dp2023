// Kelas anak kedua yang menginduk ke Perangkat
class Smartphone extends Perangkat {
    private String sistemOperasi;

    public Smartphone(String nama, String sistemOperasi) {
        super(nama);
        this.sistemOperasi = sistemOperasi;
    }

    public String getSistemOperasi() {
        return sistemOperasi;  // Getter
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;  // Setter
    }
    @Override
    public void infoPerangkat() {
        super.infoPerangkat();  // Memanggil metode induk
        System.out.println("Sistem Operasi: " + sistemOperasi);
    }
}
