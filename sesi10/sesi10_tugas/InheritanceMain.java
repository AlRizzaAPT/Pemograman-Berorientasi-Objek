package sesi10_tugas;

public class InheritanceMain {
    public static void main(String[] args) {
        Pesawat pswt = new Pesawat ("Lion Air", "Economy	", "14ILD23");
        System.out.println("Flight: " + pswt.getFlight());
        System.out.println("Maskapai: " + pswt.getMaskapai());
        System.out.println("Kategori: " + pswt.getKategori());
    }
}