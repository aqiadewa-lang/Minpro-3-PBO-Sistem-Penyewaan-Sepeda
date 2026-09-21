package com.mycompany.sistem.penyewaan.sepeda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sepeda> daftarSepeda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // --- DUMMY DATA AWAL ---
        daftarSepeda.add(new SepedaGunung("SPD-01", "Polygon Xtrada", 75000, "Hardtail"));
        daftarSepeda.add(new SepedaListrik("SPD-02", "Selis Eagle", 100000, 10000));

        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n=== SISTEM PENYEWAAN SEPEDA ===");
            System.out.println("1. Tampilkan Daftar Sepeda");
            System.out.println("2. Tambah Sepeda Baru");
            System.out.println("3. Ubah Data Sepeda");
            System.out.println("4. Hapus Sepeda");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            // Validasi Input Menu
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Input harus berupa angka 1-5!");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DAFTAR SEPEDA ---");
                    if (daftarSepeda.isEmpty()) {
                        System.out.println("Belum ada data sepeda.");
                    } else {
                        for (Sepeda s : daftarSepeda) {
                            System.out.println(s.getDetail());
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- TAMBAH SEPEDA BARU ---");
                    System.out.print("ID Sepeda: ");
                    String idBaru = scanner.nextLine();
                    
                    System.out.print("Merk Sepeda: ");
                    String merkBaru = scanner.nextLine();

                    // Validasi Harga
                    double hargaBaru = 0;
                    while (true) {
                        try {
                            System.out.print("Harga Sewa/Hari: Rp ");
                            hargaBaru = Double.parseDouble(scanner.nextLine());
                            if (hargaBaru <= 0) {
                                System.out.println("Harga harus lebih dari 0!");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Input harga harus berupa angka!");
                        }
                    }

                    // Pilihan Subclass (Inheritance)
                    int jenisPilihan = 0;
                    while (jenisPilihan != 1 && jenisPilihan != 2) {
                        try {
                            System.out.println("Pilih Jenis Sepeda:");
                            System.out.println("1. Sepeda Gunung");
                            System.out.println("2. Sepeda Listrik");
                            System.out.print("Pilihan (1/2): ");
                            jenisPilihan = Integer.parseInt(scanner.nextLine());

                            if (jenisPilihan == 1) {
                                System.out.print("Tipe Suspensi (misal: Full/Hardtail): ");
                                String suspensi = scanner.nextLine();
                                daftarSepeda.add(new SepedaGunung(idBaru, merkBaru, hargaBaru, suspensi));
                            } else if (jenisPilihan == 2) {
                                System.out.print("Kapasitas Baterai (mAh): ");
                                int baterai = Integer.parseInt(scanner.nextLine());
                                daftarSepeda.add(new SepedaListrik(idBaru, merkBaru, hargaBaru, baterai));
                            } else {
                                System.out.println("Pilihan tidak valid, pilih 1 atau 2.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Input harus berupa angka!");
                        }
                    }

                    System.out.println("Data sepeda berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("\n--- UBAH SEPEDA ---");
                    System.out.print("Masukkan ID Sepeda yang ingin diubah: ");
                    String idEdit = scanner.nextLine();
                    boolean adaEdit = false;

                    for (Sepeda s : daftarSepeda) {
                        if (s.getIdSepeda().equalsIgnoreCase(idEdit)) {
                            System.out.print("Merk Baru: ");
                            s.setMerk(scanner.nextLine());

                            while (true) {
                                try {
                                    System.out.print("Harga Baru: Rp ");
                                    s.setHargaSewaPerHari(Double.parseDouble(scanner.nextLine()));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Error: Input harga harus berupa angka!");
                                }
                            }
                            adaEdit = true;
                            System.out.println("Data sepeda berhasil diperbarui.");
                            break;
                        }
                    }

                    if (!adaEdit) {
                        System.out.println("ID Sepeda tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- HAPUS SEPEDA ---");
                    System.out.print("Masukkan ID Sepeda yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    boolean adaHapus = false;

                    for (int i = 0; i < daftarSepeda.size(); i++) {
                        if (daftarSepeda.get(i).getIdSepeda().equalsIgnoreCase(idHapus)) {
                            daftarSepeda.remove(i);
                            adaHapus = true;
                            System.out.println("Data sepeda berhasil dihapus.");
                            break;
                        }
                    }

                    if (!adaHapus) {
                        System.out.println("ID Sepeda tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        }
        scanner.close();
    }
}