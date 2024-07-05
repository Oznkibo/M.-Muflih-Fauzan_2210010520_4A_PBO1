# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data KelompokTani menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, tahunPembuatan, luasSawah, alamat dan jenisTanaman dan memberikan output berupa informasi detail dari KelompokTani tersebut seperti tahun dibuat, luasSawah, alat yang digunakan, dan jenisTanaman.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KelompokTani`, `KelompokTaniModern`, dan `PetaniModern` adalah contoh dari class.

```bash
public class KelompokTani {
    ...
}

public class KelompokTaniModern extends KelompokTani {
    ...
}

public class PetaniModern {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, kelompokTaniArray[i] = new KelompokTaniModern(nama, tahunPembuatan, luasSawah, alamat, jenisTanaman, alat); adalah contoh pembuatan object.
```bash
kelompokTaniArray[i] = new KelompokTaniModern(nama, tahunPembuatan, luasSawah, alamat, jenisTanaman, alat);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`tahunPembuatan`,`luasSawah`,`alamat` dan `jenisTanaman` adalah contoh atribut.

```bash
 String nama;
 int tahunPembuatan;
 int luasSawah;
 String alamat;
 String jenisTanaman;
 String alat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KelompokTani` dan `KelompokTaniModern`.

```bash
public KelompokTani(String nama, int tahunPembuatan, int luasSawah, String alamat, String jenisTanaman) {
        this.nama = nama;
        this.tahunPembuatan = tahunPembuatan;
        this.luasSawah = luasSawah;
        this.alamat = alamat;
        this.jenisTanaman = jenisTanaman;
    }

 public KelompokTaniModern(String nama, int tahunPembuatan, int luasSawah, String alamat, String jenisTanaman, String alat) {
        super(nama, tahunPembuatan, luasSawah, alamat, jenisTanaman);
        this.alat = alat;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`,`setTahunPembuatan`,`setLuasSawah`,`setAlamat`,`setJenisTanaman` dan `setAlat` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public void setLuasSawah(int luasSawah) {
        this.luasSawah = luasSawah;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisTanaman(String jenisTanaman) {
        this.jenisTanaman = jenisTanaman;
    }
	public void setAlat(String alat) {
        this.alat = alat;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getTahunPembuatan`, `getLuasSawah`, `getAlamat`, `getJenisTanaman`, dan `getAlat` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public int getLuasSawah() {
        return luasSawah;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisTanaman() {
        return jenisTanaman;
    }
	public String getAlat() {
        return alat;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`,`tahunPembuatan`,`luasSawah`,`alamat`,`jenisTanaman` dan `alat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int tahunPembuatan;
private int luasSawah;
private String alamat;
private String jenisTanaman;
private String alat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KelompokTaniModern` mewarisi `KelompokTani` dengan sintaks `extends`.

```bash
public class KelompokTaniModern extends KelompokTani {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `KelompokTani` merupakan overloading method `displayInfo` dan `displayInfo` di `KelompokTaniModern` merupakan override dari method `displayInfo` di `KelompokTani`.

```bash
public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Alat: " + alat);
    }

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `tampilkanInfo` untuk menampilkan informasi alat jika ada.

```bash
public void tampilkanInfo() {
    System.out.println("Nama Kelompok Tani: " + getNama());
    System.out.println("Tahun Pembuatan: " + getTahunPembuatan());
    System.out.println("Luas Sawah: " + getLuasSawah() + " Ha");
    System.out.println("Alamat: " + getAlamat());
    System.out.println("Jenis Tanaman: " + getJenisTanaman());
    
    if (this instanceof KelompokTaniModern) {
        KelompokTaniModern ktm = (KelompokTaniModern) this;
        System.out.println("Alat: " + ktm.getAlat());
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < kelompokTaniArray.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Kelompok Tani ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Kelompok Tani:");
kelompokTani.tampilkanInfo();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KelompokTaniModern[] KelompokTaniArray = new KelompokTaniModern[2];` adalah contoh penggunaan array.

```bash
KelompokTaniModern[] KelompokTaniArray = new KelompokTaniModern[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Muflih Fauzan 
NPM: 2210010520
