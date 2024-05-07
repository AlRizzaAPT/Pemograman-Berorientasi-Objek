package sesi10_tugas;

public class Penerbangan {
	    protected String maskapai;
	    protected String kategori;

	    public Penerbangan(String maskapai, String kategori) {
	        this.maskapai = maskapai;
	        this.kategori = kategori;
	    }

	    public String getMaskapai() {
	        return maskapai;
	    }

	    public String getKategori() {
	        return kategori;
	    }
}
