// Kelas anak pertama yang menginduk ke Perangkat
class Laptop extends Perangkat {
    private String processor;

    public Laptop(String nama, String processor) {
        super(nama);  // Memanggil konstruktor induk
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;  // Getter
    }

    public void setProcessor(String processor) {
        this.processor = processor;  // Setter
    }

    @Override
    public void infoPerangkat() {
        super.infoPerangkat();  // Memanggil metode induk
        System.out.println("Processor: " + processor);
    }
}
