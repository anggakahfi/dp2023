// Kelas induk pertama
public class Perangkat {

        private String nama;  // Encapsulasi

        public Perangkat(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return nama;  // Getter
        }

        public void setNama(String nama) {
            this.nama = nama;  // Setter
        }

        public void infoPerangkat() {
            System.out.println("Nama Perangkat: " + nama);
        }
    }

