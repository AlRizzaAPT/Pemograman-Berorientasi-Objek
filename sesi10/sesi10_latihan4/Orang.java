package sesi10_latihan4;

public class Orang {
    protected String nama;
    protected String alamat;

    public Orang(){
        nama = "Ade Sukendar";
        alamat = "Bandung";
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }
}