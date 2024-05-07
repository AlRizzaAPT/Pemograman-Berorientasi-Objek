package sesi10_tugas;

public class Pesawat extends Penerbangan
{
    private String flight;

    public Pesawat(String maskapai, String kategori, String flight) {
        super(maskapai, kategori);
        this.flight = flight;
    }

    public String getFlight() {
        return flight;
    }

    public void setPlatNomor(String flight) {
        this.flight = flight;
    }
}
