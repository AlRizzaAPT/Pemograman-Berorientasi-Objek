package Interface;

public interface Pembayaran {
 public boolean otentikasi(String pin);
 public void prosesPembayaran(String pin, double jumlah);
}