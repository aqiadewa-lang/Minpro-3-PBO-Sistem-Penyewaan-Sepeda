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

# **5. Penerapan Konsep Minpro 3**
 
## **5.1 Abstraction (Abstract Class & Abstract Method)**
 
Abstraction adalah konsep menyembunyikan detail implementasi dan hanya menampilkan kerangka umum dari suatu objek. Pada program ini, abstraction diterapkan pada class `Sepeda`.
 
Class `Sepeda` dideklarasikan sebagai **abstract class** karena "sepeda" hanyalah konsep umum, sedangkan objek yang nyata adalah jenisnya, yaitu `SepedaGunung` dan `SepedaListrik`. Karena bersifat abstract, class `Sepeda` **tidak dapat diinstansiasi** secara langsung (`new Sepeda()` akan menyebabkan error) dan hanya berfungsi sebagai kerangka bagi class turunannya.
 
```java
public abstract class Sepeda implements Sewaable {
    ...
    // Abstract method: tidak punya isi, wajib di-override oleh subclass
    public abstract String getKategori();
}
```
 
Di dalam `Sepeda` terdapat **abstract method** `getKategori()`. Method ini hanya berisi deklarasi tanpa isi (body), sehingga setiap subclass **wajib** mendefinisikan sendiri kategorinya. `SepedaGunung` mengembalikan "Sepeda Gunung" dan `SepedaListrik` mengembalikan "Sepeda Listrik". Selain itu, atribut umum (`idSepeda`, `merk`, `hargaSewaPerHari`) cukup ditulis sekali di `Sepeda` lalu diwariskan ke kedua subclass.
 
**Screenshot 1 – Deklarasi abstract class dan abstract method (`Sepeda.java`)**
 
[TEMPEL SCREENSHOT 1 DI SINI]
 
**Screenshot 2 – Implementasi abstract method `getKategori()` pada subclass (`SepedaGunung.java` dan `SepedaListrik.java`)**
 
[TEMPEL SCREENSHOT 2 DI SINI]
 
---
 
## **5.2 Polymorphism**
 
Polymorphism berarti satu nama method dapat memiliki perilaku berbeda. Program ini menerapkan dua bentuk polymorphism, yaitu **overriding** dan **overloading**.
 
### **a. Overriding**
 
Overriding adalah ketika subclass menulis ulang method milik parent class dengan nama dan parameter yang sama, ditandai dengan anotasi `@Override`. Penerapannya:
 
| Method | Class | Perilaku |
|---|---|---|
| `getKategori()` | `SepedaGunung` | Mengembalikan "Sepeda Gunung" |
| `getKategori()` | `SepedaListrik` | Mengembalikan "Sepeda Listrik" |
| `hitungBiayaSewa(int)` | `SepedaGunung` | Diskon 10% jika sewa 7 hari atau lebih |
| `hitungBiayaSewa(int)` | `SepedaListrik` | Ditambah biaya pengisian baterai Rp 5.000 per hari |
| `getDetail()` | `SepedaGunung` | Menambahkan informasi suspensi |
| `getDetail()` | `SepedaListrik` | Menambahkan informasi kapasitas baterai |
 
Bukti polymorphism terlihat pada method `tampilkanSepeda()` di `MenuView`. List bertipe `Sepeda` berisi objek `SepedaGunung` dan `SepedaListrik`. Ketika `s.getDetail()` dipanggil, Java secara otomatis menjalankan versi method sesuai jenis objek sebenarnya, sehingga output tiap sepeda berbeda walaupun kode pemanggilannya sama. Hal yang sama terjadi pada `hitungBiayaSewa()` ketika transaksi dibuat.
 
**Screenshot 3 – Method `hitungBiayaSewa()` di `Sepeda` dan hasil override di subclass**
 
[TEMPEL SCREENSHOT 3 DI SINI]
 
**Screenshot 4 – Override `getDetail()` pada `SepedaGunung` dan `SepedaListrik`**
 
[TEMPEL SCREENSHOT 4 DI SINI]
 
**Screenshot 5 – Pemanggilan polymorphic `s.getDetail()` pada `MenuView.tampilkanSepeda()`**
 
[TEMPEL SCREENSHOT 5 DI SINI]
 
**Screenshot 6 – Output menu 1 (Tampilkan Daftar Sepeda): detail berbeda untuk tiap jenis sepeda**
 
[TEMPEL SCREENSHOT 6 DI SINI]
 
### **b. Overloading**
 
Overloading adalah beberapa method dengan nama yang sama tetapi parameter berbeda dalam satu class. Penerapannya ada dua:
 
1. **Method `hitungTotalBiaya()` pada `TransaksiSewa`**
   - `hitungTotalBiaya()` tanpa parameter, menghitung biaya sewa normal.
   - `hitungTotalBiaya(double diskonRupiah)` dengan satu parameter, menghitung biaya setelah dikurangi diskon.
2. **Constructor pada `SepedaGunung`**
   - `SepedaGunung(String, String, double, int jumlahGear)` untuk sepeda gunung dengan data jumlah gear.
   - `SepedaGunung(String, String, double, String suspensi)` untuk sepeda gunung dengan data tipe suspensi (dipakai pada menu Tambah Sepeda).
Java membedakan method mana yang dipanggil berdasarkan jumlah dan tipe parameter yang diberikan.
 
**Screenshot 7 – Dua method `hitungTotalBiaya` pada `TransaksiSewa.java`**
 
[TEMPEL SCREENSHOT 7 DI SINI]
 
**Screenshot 8 – Dua constructor pada `SepedaGunung.java`**
 
[TEMPEL SCREENSHOT 8 DI SINI]
 
**Screenshot 9 – Output menu 5 (Buat Transaksi) untuk Sepeda Gunung: biaya normal dan biaya diskon**
 
[TEMPEL SCREENSHOT 9 DI SINI]
 
**Screenshot 10 – Output menu 5 (Buat Transaksi) untuk Sepeda Listrik: biaya berbeda karena override `hitungBiayaSewa()`**
 
[TEMPEL SCREENSHOT 10 DI SINI]
 
---
 
## **5.3 Interface (Nilai Tambah)**
 
Interface adalah kontrak yang berisi daftar method yang wajib dimiliki oleh class yang mengimplementasikannya. Program ini memiliki interface `Sewaable`:
 
```java
public interface Sewaable {
    double hitungBiayaSewa(int lamaSewa);
    String getDetail();
}
```
 
Class `Sepeda` mengimplementasikan interface ini dengan kata kunci `implements Sewaable`, sehingga semua jenis sepeda dijamin memiliki kemampuan menghitung biaya sewa dan menampilkan detail. Interface ini juga dimanfaatkan oleh `TransaksiSewa` melalui pemanggilan `sepeda.hitungBiayaSewa(lamaSewahari)`.
 
**Screenshot 11 – Isi interface `Sewaable.java`**
 
[TEMPEL SCREENSHOT 11 DI SINI]
 
**Screenshot 12 – Class `Sepeda` yang meng-`implements Sewaable` dan mengimplementasikan method-nya**
 
[TEMPEL SCREENSHOT 12 DI SINI]
 
---
 
## **5.4 Struktur MVC (Model, View, Controller)**
 
Program ini menggunakan arsitektur MVC yang memisahkan tanggung jawab kode ke dalam tiga bagian:
 
| Package | Class | Peran |
|---|---|---|
| `model` | `Sepeda`, `SepedaGunung`, `SepedaListrik`, `Pelanggan`, `TransaksiSewa`, `Sewaable` | Menyimpan data dan logika bisnis, seperti perhitungan biaya sewa |
| `view` | `MenuView` | Mengatur tampilan menu serta input dan output dari pengguna |
| `controller` | `SepedaController` | Penghubung antara View dan Model. Menyimpan `ArrayList` data serta menyediakan method tambah, cari, hapus, dan cek ID |
| `main` | `Main` | Titik masuk program, membuat `MenuView` lalu menjalankan menu utama |
 
**Contoh alur (menu Tambah Sepeda):**
 
1. Pengguna memasukkan data di **View** (`MenuView.tambahSepeda()`).
2. View membuat objek **Model** (`new SepedaGunung(...)`) lalu mengirimkannya ke **Controller** (`controller.tambahSepeda(...)`).
3. Controller menyimpan objek tersebut ke dalam `ArrayList<Sepeda>`.
4. Saat menu Tampilkan dipilih, View meminta data dari Controller (`controller.getDaftarSepeda()`) lalu menampilkannya.
View tidak menyimpan data sendiri, dan Model tidak mengetahui apa pun tentang tampilan. Dengan pemisahan ini kode lebih rapi dan mudah dikembangkan.
 
**Screenshot 13 – Struktur package proyek di NetBeans (`controller`, `main`, `model`, `view`)**
 
[TEMPEL SCREENSHOT 13 DI SINI]
 
**Screenshot 14 – Class `SepedaController.java` (Controller)**
 
[TEMPEL SCREENSHOT 14 DI SINI]
 
**Screenshot 15 – Class `MenuView.java` yang memanggil `controller` (View)**
 
[TEMPEL SCREENSHOT 15 DI SINI]
 
**Screenshot 16 – Class `Main.java` (titik masuk program)**
 
[TEMPEL SCREENSHOT 16 DI SINI]
