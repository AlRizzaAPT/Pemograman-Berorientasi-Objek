package latihan4;

public class MatakuliahMain {

    public static void main(String[] args) {
        // Create objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
        // Tampilkan daftar matakuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());
        System.out.println("--- Nilai IPK ---");
        // Hitung IPK
        double ipk = ((mk1.nilaiIndex() * mk1.getsks()) + (mk2.nilaiIndex() * mk2.getsks()) + (mk3.nilaiIndex() * mk3.getsks())) / (double) (mk1.getsks() + mk2.getsks() + mk3.getsks());
        System.out.println("IPK: " + ipk);
    }
    
}
