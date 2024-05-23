package Interface;

public class PembayaranKartuDebit implements Pembayaran {
 private String nomorKartu;
 private String pin;
 private double saldo;

 public PembayaranKartuDebit(String nomorKartu, String pin, double saldo) {
     this.nomorKartu = nomorKartu;
     this.pin = pin;
     this.saldo = saldo;
 }

 @Override
 public boolean otentikasi(String pinInput) {
     return pin.equals(pinInput);
 }

 @Override
 public void prosesPembayaran(String pin, double jumlah) {
     if (otentikasi(pin)) {
         if (saldo >= jumlah) {
             saldo -= jumlah;
             System.out.println("Pembayaran sebesar $" + jumlah + " berhasil. Sisa saldo: $" + saldo);
         } else {
             System.out.println("Saldo tidak mencukupi.");
         }
     } else {
         System.out.println("Otentikasi gagal. Pembayaran ditolak.");
     }
 }
}