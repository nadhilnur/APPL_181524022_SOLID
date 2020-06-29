# APPL_181524022_SOLID

**S.O.L.I.D** adalah akronim untuk lima prinsip pertama desain berorientasi objek (OOD).

**S.O.L.I.D** adalah singkatan dari:

- **S** - Single-responsiblity principle

Kelas harus memiliki satu dan hanya satu alasan untuk berubah, artinya kelas harus hanya memiliki satu pekerjaan.
- **O** - Open-closed principle

Objek atau entity harus terbuka untuk ekstensi, tetapi tertutup untuk modifikasi.
- **L** - Liskov substitution principle

Setiap subkelas / kelas turunan harus dapat diganti untuk kelas dasar / induknya.
- **I** - Interface segregation principle

Pengguna tidak boleh dipaksa untuk mengimplementasikan antarmuka yang tidak digunakan atau pengguna tidak boleh dipaksa bergantung pada metode yang tidak mereka gunakan.
- **D** - Dependency Inversion Principle

Entity harus bergantung pada abstraksi bukan pada konkret. Ini menyatakan bahwa modul tingkat tinggi tidak boleh bergantung pada modul tingkat rendah, tetapi mereka harus bergantung pada abstraksi.

Prinsip-prinsip ini, ketika digabungkan bersama, memudahkan programmer untuk mengembangkan perangkat lunak yang mudah dipelihara dan dikembangkan. Mereka juga membuatnya mudah bagi pengembang untuk menghindari bau kode, kode refactor mudah, dan juga merupakan bagian dari pengembangan perangkat lunak tangkas atau adaptif.

## Soal

### 1. Stream Progress Info

Refactor kode untuk tugas ini, sehingga Stream Progress Info dapat bekerja dengan berbagai jenis Streaming. Pertama pastikan Stream Progress Info berfungsi dengan Musik juga. Refaktor kodenya sehingga di masa mendatang jika terdapat stream baru hanya perlu mengimpor satu kelas baru dengan BytesSent dan Length getter di dalamnya.

### 2. Graphic Editor

Refaktor kode untuk tugas ini, sehingga Graphic Editor dapat menggambar semua jenis bentuk tanpa memeriksa seperti apa bentuk konkretnya. Nantinya bentuk baru akan ditambahkan ke sistem, jadi persiapkan sistem untuk momen ini. Ketika terdapat bentuk baru, maka hanya perlu menambahkan kelas baru.

### 3. Detail Printer

Refaktor kode untuk tugas ini, sehingga Printer Detail tidak perlu menanyakan karyawan seperti apa yang diteruskan. Detail Printer hanya perlu mencetak detail untuk semua jenis karyawan. Ketika jenis karyawan baru ditambahkan, maka hanya perlu menambahkan kelas baru.

### 4. Recharge

Diberikan library dengan kelas-kelas berikut

- Worker mengimplementasikan ISleeper
- Employee mewarisi Worker
- Robot mewarisi Worker
- RechargeStation

Di dalam kode terdapat beberapa kelas yang memiliki metode yang tidak dapat digunakan (throw UnsupportedOpperationException) yang berarti kode tersebut harus di refaktor.

Perbaiki struktur sehingga sesuai dengan prinsip Segregasi Antarmuka.

### 5. Security Door

Diberikan:

- SecurityManager
- Kelas abstrak SecurityCheck
- Antarmuka SecurityUI

SecurityManager dapat berinteraksi dengan pengguna dengan memvalidasi kartu kuncinya atau dengan mendapatkan kode pinnya. Kedua metode disediakan oleh antarmuka yang disebut SecurityUI. Validasi dilakukan oleh kelas SecurityCheck yang sesuai.

Perbaiki struktur sehingga sesuai dengan prinsip Segregasi Antarmuka.
