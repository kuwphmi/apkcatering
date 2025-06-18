# Aplikasi Penyedia Layanan Katering

**Aplikasi Penyedia Layanan Katering** adalah aplikasi desktop berbasis Java yang dirancang untuk membantu pelaku usaha mikro, kecil, dan menengah (UMKM) di bidang katering mengelola usaha mereka secara efisien. Aplikasi ini menyediakan modul pengelolaan data pesanan, pelanggan, dan menu makanan. Fitur-fitur tersebut fokus pada pengelolaan data utama bisnis katering agar proses pemesanan dan pelayanan pelanggan menjadi lebih cepat dan terorganisir. Dengan mengotomasi pencatatan pesanan dan data pelanggan, aplikasi ini dapat meningkatkan efisiensi operasional usaha katering (sejalan dengan tren digitalisasi UMKM).

## Fitur Utama

* **Manajemen Pesanan**: Menyimpan dan memproses informasi pesanan pelanggan (buat, ubah, hapus pesanan).
* **Manajemen Pelanggan**: Menyimpan data pelanggan, termasuk nama, kontak, dan alamat.
* **Manajemen Menu Makanan**: Menyimpan daftar menu makanan dan minuman (nama menu, harga, kategori).

Fitur-fitur ini dirancang agar pemilik usaha katering dapat meningkatkan efisiensi operasional, mengelola pesanan dan data pelanggan dengan lebih baik, serta meningkatkan pengalaman pelanggan. Sebagai contoh, sejumlah aplikasi katering profesional menekankan manajemen pesanan dan pelanggan sebagai fitur utama untuk memudahkan usaha katering.

## Teknologi yang Digunakan

* **Bahasa Pemrograman**: Java (JDK). Java adalah bahasa pemrograman berorientasi objek yang umum digunakan untuk aplikasi desktop dan bersifat *cross-platform*.
* **IDE**: Apache NetBeans. NetBeans adalah lingkungan pengembangan (IDE) gratis dan open-source yang menyediakan editor, wizard, dan template untuk membuat aplikasi Java. NetBeans dapat diinstal di Windows, Linux, dan macOS (bersifat *cross-platform*).
* **Framework**: Java Desktop (menggunakan Swing/AWT bawaan Java, tanpa framework tambahan).
* **Database**: MySQL. Database menggunakan storage engine InnoDB (mesin penyimpanan default MySQL yang mendukung transaksi), dengan collation `utf8mb4_general_ci` (karakter UTF-8 4-byte). Penggunaan `utf8mb4` memastikan dukungan penuh untuk berbagai karakter Unicode, termasuk emoji dan simbol.
* **Lainnya**: JDBC untuk koneksi database, dan library Java standar untuk GUI.

## Cara Instalasi dan Penggunaan

1. **Pasang Java JDK dan MySQL**: Instalasi Java Development Kit (JDK) terbaru dari situs resmi Oracle atau OpenJDK, serta pasang MySQL Server di komputer Anda.
2. **Buat Database**: Setelah MySQL terpasang, buat database bernama `db_katering`. Anda dapat menjalankan skrip SQL untuk membuat tabel `akun`, `menu`, dan `pelanggan` sesuai dengan struktur yang diberikan (setiap tabel menggunakan engine InnoDB dan collation `utf8mb4_general_ci`).
3. **Konfigurasi Koneksi**: Buka file `Koneksi.java` di project aplikasi, lalu sesuaikan kredensial (URL, username, password) MySQL dengan environment Anda. Pastikan `db_katering` sudah benar dan akun database memiliki izin akses.
4. **Jalankan Aplikasi**: Buka project di NetBeans, lalu jalankan (`Run Project`). Aplikasi akan memuat tampilan **Login**. Masukkan username "admin" dan password "admin123" .
5. **Mulai Menggunakan**: Setelah login, Anda akan masuk ke **Menu Utama**. Gunakan menu yang tersedia untuk mengelola data **Pesanan**, **Pelanggan**, dan **Menu Makanan** melalui antarmuka grafis. Setiap modul memiliki form tabel untuk menambah, mengubah, menghapus, dan melihat data. Ikuti instruksi di layar untuk melakukan operasi pada data.

## Struktur Database

Database MySQL `db_katering` menggunakan engine InnoDB dan charset `utf8mb4_general_ci` (konfigurasi default MySQL untuk dukungan transaksi dan karakter Unicode). Terdapat tiga tabel utama dalam database ini:

* **`akun`** – Menyimpan informasi akun pengguna aplikasi (misalnya *username* dan *password*). Digunakan untuk otentikasi login ke aplikasi.
* **`menu`** – Menyimpan data menu makanan/minuman (misalnya nama menu, harga, kategori, dsb). Fungsinya mengelola daftar menu yang ditawarkan katering.
* **`pelanggan`** – Menyimpan data pelanggan (nama, nomor kontak, alamat, dan lain-lain). Memudahkan pencatatan dan pencarian data pelanggan katering.

Semua tabel di atas menggunakan InnoDB (penyimpanan default MySQL) dan charset UTF-8 (`utf8mb4_general_ci`) untuk memastikan performa yang baik dan kompatibilitas karakter internasional.

## Kontributor

* Tim Pengembang

## Lisensi

Belum ditentukan.

