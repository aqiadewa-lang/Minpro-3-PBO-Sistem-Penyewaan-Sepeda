package com.mycompany.sistem.penyewaan.sepeda;

public class SepedaListrik extends Sepeda {
    private int kapasitasBaterai; // Dalam mAh

    public SepedaListrik(String idSepeda, String merk, double hargaSewaPerHari, int kapasitasBaterai) {
        super(idSepeda, merk, hargaSewaPerHari);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getKapasitasBaterai() { return kapasitasBaterai; }
    public void setKapasitasBaterai(int kapasitasBaterai) { this.kapasitasBaterai = kapasitasBaterai; }

    @Override
    public String getDetail() {
        return super.getDetail() + " | Jenis: Sepeda Listrik | Baterai: " + kapasitasBaterai + " mAh";
    }
}