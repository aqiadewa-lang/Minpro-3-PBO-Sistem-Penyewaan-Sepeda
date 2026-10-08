package model;

public class SepedaGunung extends Sepeda {
    private int jumlahGear;

    public SepedaGunung(String idSepeda, String merk, double hargaSewaPerHari, int jumlahGear) {
        super(idSepeda, merk, hargaSewaPerHari);
        this.jumlahGear = jumlahGear;
    }

    public SepedaGunung(String idSepeda, String merk, double hargaSewaPerHari, String suspensi) {
    super(idSepeda, merk, hargaSewaPerHari);
    // simpan atau atur variabel suspensi sesuai atribut di class kamu
}
    public int getJumlahGear() { return jumlahGear; }
    public void setJumlahGear(int jumlahGear) { this.jumlahGear = jumlahGear; }

    @Override
    public String getKategori() {
        return "Sepeda Gunung";
    }

    @Override
    public String getDetail() {
        return super.getDetail() + " | Jenis: " + getKategori() + " | Gear: " + jumlahGear;
    }
}