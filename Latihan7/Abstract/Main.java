package Abstract;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(10);
        System.out.println(" == Persegi == ");
        System.out.println("Sisi : " + persegi.getSisi());
        System.out.println("Luas : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(10, 5);
        System.out.println(" == Segitiga == ");
        System.out.println("Alas : " + segitiga.getAlas() + " , Tinggi : " + segitiga.getTinggi());
        System.out.println("Luas : " + segitiga.hitungLuas());
    }
}
