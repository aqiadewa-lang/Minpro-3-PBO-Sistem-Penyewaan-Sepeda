package com.mycompany.sistem.penyewaan.sepeda;

public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;

    public SepedaGunung(String idSepeda, String merk, double hargaSewaPerHari, String tipeSuspensi) {
        super(idSepeda, merk, hargaSewaPerHari);
        this.tipeSuspensi = tipeSuspensi;
    }

    public String getTipeSuspensi() { return tipeSuspensi; }
    public void setTipeSuspensi(String tipeSuspensi) { this.tipeSuspensi = tipeSuspensi; }

    @Override
    public String getDetail() {
        return super.getDetail() + " | Jenis: Sepeda Gunung | Suspensi: " + tipeSuspensi;
    }
}