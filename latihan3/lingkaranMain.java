package latihan3;

public class lingkaranMain {
    public static void main(String[] args) {
        // Buat objek l1 dengan jari-jari 5
        Lingkaran lingkaran1 = new Lingkaran(5);
        // Buat objek l2 dengan jari-jari sama dengan l1
        Lingkaran lingkaran2 = lingkaran1;
        // Cetak jari-jari l1, l2
        System.out.println(lingkaran1.getJari2());
        System.out.println(lingkaran2.getJari2());
        // Set l2 menjadi 4
        ubahJari2(lingkaran2);
        // Cetak jari-jari l1, l2
        System.out.println(lingkaran1.getJari2());
        System.out.println(lingkaran2.getJari2());
    }

    // Buat method ubahJari2
    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }
}

class Lingkaran {
    private double jari2;
    // Buat constructor Lingkaran
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    // Buat method getJari2
    public double getJari2() {
        return jari2;
    }
    // Buat method setJari2
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
}