package latihan3;

public class RefObjek2 {
    public static void main(String[] args) {
        // Buat objek l1 dengan jari-jari 5
        Lingkaran l1 = new Lingkaran(5);
        // Buat objek l2 dengan jari-jari sama dengan l1
        Lingkaran l2 = l1;
        // Buat objek l3 dengan jari-jari 7
        Lingkaran l3 = new Lingkaran(7);
        // Cetak jari-jari l1, l2, dan l3   
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        // Set l2 menjadi l3
        l2 = l3;
        // Cetak jari-jari l1, l2, dan l3
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
    }
}