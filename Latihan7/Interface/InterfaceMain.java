package Interface;

public class InterfaceMain {
    public static void main(String[] args){
        Pembayaran pembayaran = new PembayaranKartuDebit("123456", "1234", 500.0);
        pembayaran.prosesPembayaran("1234", 100.0);
    }
}