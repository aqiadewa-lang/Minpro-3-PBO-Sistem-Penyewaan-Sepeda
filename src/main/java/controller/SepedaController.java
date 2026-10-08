package controller;

import java.util.ArrayList;
import model.*;

public class SepedaController {
    private final ArrayList<Sepeda> daftarSepeda;
    private ArrayList<TransaksiSewa> daftarTransaksi;
    private ArrayList<Pelanggan> daftarPelanggan;

    public SepedaController() {
        daftarSepeda = new ArrayList<>();
        daftarTransaksi = new ArrayList<>();
        daftarPelanggan = new ArrayList<>();
        
        // Dummy data pelanggan
        daftarPelanggan.add(new Pelanggan("P-001", "Budi", "08123456789"));
        
        // Dummy data sepeda awal
        daftarSepeda.add(new SepedaGunung("SPD-01", "Polygon Xtrada", 75000, "Hardtail"));
        daftarSepeda.add(new SepedaListrik("SPD-02", "Selis Eagle", 100000, 10000));
    }

    public ArrayList<Sepeda> getDaftarSepeda() {
        return daftarSepeda;
    }
    
    public ArrayList<TransaksiSewa> getDaftarTransaksi() {
        return daftarTransaksi;
    }
    
    public Pelanggan getPelangganPertama() {
        return daftarPelanggan.get(0); // Ambil dummy pelanggan untuk simulasi transaksi
    }

    // Method mengecek duplikat ID (FIX BUG: Nambah sepeda ID sama)
    public boolean isIdExist(String id) {
        for (Sepeda s : daftarSepeda) {
            if (s.getIdSepeda().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void tambahSepeda(Sepeda sepeda) {
        daftarSepeda.add(sepeda);
    }
    
    public void tambahTransaksi(TransaksiSewa transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public Sepeda cariSepeda(String id) {
        for (Sepeda s : daftarSepeda) {
            if (s.getIdSepeda().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null; // Jika tidak ditemukan
    }

    public boolean hapusSepeda(String id) {
        Sepeda s = cariSepeda(id);
        if (s != null) {
            daftarSepeda.remove(s);
            return true;
        }
        return false;
    }
}