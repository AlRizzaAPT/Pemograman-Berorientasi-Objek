package latihan4;

public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    /* Konstruktor */
    public MataKuliah(String kode, String nama, String index, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public int nilaiIndex() {
        // Berdasarkan index matakuliah
        // A=4, AB=3.5, B, 3, BC=2.5, C=2, D=1, E=0
        int nilai = 0;
        switch (index) {
            case "A":
                nilai = 4;
                break;
            case "AB":
                nilai = 3;
                break;
            case "B":
                nilai = 3;
                break;
            case "BC":
                nilai = 2;
                break;
            case "C":
                nilai = 2;
                break;
            case "D":
                nilai = 1;
                break;
            case "E":
                nilai = 0;
                break;
        }
        return nilai;
    }

    public String display() {
        return kode + " " + nama + " " + index;
    }

	public int getsks() {
		
		return sks;
				
	}
}