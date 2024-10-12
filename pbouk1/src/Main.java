// Kelas utama
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Acer Nitro 5 AN515-57", "11th Gen Intel(R) Core(TM) i5-11400H");
        Smartphone smartphone = new Smartphone("Samsung Galaxy S21", "Android");
        Admin admin = new Admin("anggakahfi", "anggakahfi@gmail.com", "mainadmin");
        Pelanggan pelanggan = new Pelanggan("jonikucrut", "jonikucrut@gmail.com", "jalan kenanga 15 klitren lor");

        // Menampilkan informasi perangkat
        laptop.infoPerangkat();
        smartphone.infoPerangkat();

        // Menampilkan informasi pengguna
        admin.infoPengguna();
        pelanggan.infoPengguna();
    }
}
