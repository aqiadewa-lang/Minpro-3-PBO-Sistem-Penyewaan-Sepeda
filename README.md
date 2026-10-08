# **Muhammad Aqia Yudha Yulian Putra**
# **SISTEM PENYEWAAN SEPEDA**

## **1. Deskripsi singkat program**

Aplikasi Sistem Manajemen Penyewaan Sepeda adalah program berbasis konsol (CLI) yang dikembangkan menggunakan bahasa pemograman Java dengan menerapkan arsitektur MVC (Model-View-Controller) dan prinsip Pemrograman Berorientasi Objek (PBO). Tujuan utama dari program ini adalah untuk mendigitalisasi dan menyederhanakan proses operasional bisnis penyewaan sepeda—mulai dari manajemen data inventaris sepeda (seperti Sepeda Gunung dan Sepeda Listrik), pengelolaan data pelanggan, hingga pemrosesan transaksi sewa secara akurat, lengkap dengan sistem validasi input, durasi hari, dan kalkulasi diskon otomatis.

# Sistem Manajemen Penyewaan Sepeda (PBO - MVC)

## Deskripsi Singkat Program
Aplikasi **Sistem Manajemen Penyewaan Sepeda** adalah program berbasis konsol (CLI) yang dikembangkan menggunakan bahasa pemograman Java dengan menerapkan arsitektur **MVC (Model-View-Controller)** dan prinsip **Pemrograman Berorientasi Objek (PBO)**. Tujuan utama dari program ini adalah untuk mendigitalisasi dan menyederhanakan proses operasional bisnis penyewaan sepeda—mulai dari manajemen data inventaris sepeda (seperti Sepeda Gunung dan Sepeda Listrik), pengelolaan data pelanggan, hingga pemrosesan transaksi sewa secara akurat, lengkap dengan sistem validasi input, durasi hari, dan kalkulasi diskon otomatis.


## Penerapan Inheritance & Nilai Tambah Polymorphism
* **Inheritance (Pewarisan)**: Kelas utama `Sepeda` bertindak sebagai *parent class* yang merangkum atribut umum (seperti `idSepeda`, `merk`, dan `hargaSewaPerHari`). Atribut dan fungsi ini diturunkan ke *child class* yaitu `SepedaGunung` dan `SepedaListrik` guna menghindari duplikasi kode dan menjaga struktur program tetap rapi.
* **Polymorphism & Interface**: Program mengimplementasikan *interface* `Sewaable` yang memaksa kelas turunan untuk melakukan *method overriding* pada fungsi perhitungan biaya sewa dan detail informasi. Hal ini memungkinkan objek dari kelas berbeda (`SepedaGunung` dan `SepedaListrik`) merespons pemanggilan method yang sama (`hitungBiayaSewa()` dan `getDetail()`) dengan perilaku spesifik sesuai jenis sepedanya masing-masing.


## Fitur Utama
1. Tampilkan Daftar Sepeda
2. Tambah Sepeda Baru (Sepeda Gunung / Sepeda Listrik)
3. Ubah Data Sepeda
4. Hapus Sepeda
5. Buat Transaksi Sewa (Lengkap dengan kalkulasi durasi dan metode *overloading* diskon)

## Cara Menjalankan Program
1. Buka proyek melalui Apache NetBeans.
2. Lakukan *Clean and Build* pada proyek `Minpro-3-PBO-Sistem-Penyewaan-Sepeda`.
3. Jalankan file utama (`Main.java`) yang berada pada paket *main*.

## **2. Penjelasan Alur Program**
Ketika program dijalankan, sistem akan menampilkan Menu Utama yang terdiri dari pilihan pengelolaan data sepeda serta menu untuk keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia:

### **Tampilkan Sepeda (Read):**

Sistem menampilkan seluruh data sepeda yang telah tersimpan di dalam sistem (ID, merk, jenis, dan harga sewa per hari).

### **Tambah Sepeda (Create):**

Pengguna memasukkan ID sepeda, merk, jenis, dan harga sewa per hari. Data kemudian disimpan ke dalam ArrayList.

### **Ubah Data Sepeda (Update):**

Pengguna memasukkan ID sepeda yang ingin diubah, kemudian memasukkan data baru berupa merk, jenis, dan harga sewa.

### **Hapus Sepeda (Delete):**

Pengguna memasukkan ID sepeda yang ingin dihapus, kemudian sistem menghapus data tersebut dari ArrayList.

### **Keluar:**

Program menampilkan pesan bahwa program telah selesai dan sistem berhenti bekerja.

# **3. Dokumentasi Program**
<img width="300" height="168" alt="image" src="https://github.com/user-attachments/assets/a3a4d683-5868-4ba9-bb0b-59e7cb980caf" />

### **Berikut tampilan Menu Utama yang menyediakan fitur untuk mengelola data sepeda, seperti melihat (Read), menambah (Create), mengubah (Update), dan menghapus (Delete) data sepeda.**

# **4. Implementasi Program**
## **4.1 Implementasi Tambah & Lihat Sepeda (Create & Read)**
<img width="497" height="753" alt="image" src="https://github.com/user-attachments/assets/4efbe5b1-3b27-4504-a49a-3d604e7857c8" />

### **Menu ini digunakan untuk menambahkan data sepeda baru dan menampilkan daftar sepeda yang tersimpan.**
 
## **4.2 Implementasi Ubah Data Sepeda (Update)**
<img width="532" height="753" alt="image" src="https://github.com/user-attachments/assets/5c74b36d-b552-4346-ba11-6bd124c3151b" />

### **Menu ini digunakan untuk mengubah informasi data sepeda berdasarkan ID sepeda, Merk sepeda, dan Jenis sepeda.**

## **4.3 Implementasi Hapus Data Sepeda (Delete)**
<img width="485" height="670" alt="image" src="https://github.com/user-attachments/assets/75ebeb06-421d-4e69-b4ba-f73dd3a34a1d" />

### **Menu ini digunakan untuk menghapus data sepeda dari sistem berdasarkan ID sepeda, Merk sepeda, dan Jenis sepeda.**
