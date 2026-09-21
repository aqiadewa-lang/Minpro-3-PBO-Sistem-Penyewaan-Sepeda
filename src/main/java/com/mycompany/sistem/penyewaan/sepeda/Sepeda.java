package com.mycompany.sistem.penyewaan.sepeda;

public class Sepeda {
    private String idSepeda;
    private String merk;
    private double hargaSewaPerHari;

    public Sepeda(String idSepeda, String merk, double hargaSewaPerHari) {
        this.idSepeda = idSepeda;
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public String getIdSepeda() { return idSepeda; }
    public void setIdSepeda(String idSepeda) { this.idSepeda = idSepeda; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public double getHargaSewaPerHari() { return hargaSewaPerHari; }
    public void setHargaSewaPerHari(double hargaSewaPerHari) { this.hargaSewaPerHari = hargaSewaPerHari; }

    public String getDetail() {
        return "[" + idSepeda + "] " + merk + " - Rp " + hargaSewaPerHari + "/hari";
    }
}