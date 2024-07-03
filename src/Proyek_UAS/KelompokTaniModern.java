/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek_UAS;

/**
 *
 * @author Asus
 */
public class KelompokTaniModern extends KelompokTani {
    // Atribut tambahan untuk kelas ini
    private String alat;

    // Constructor
    public KelompokTaniModern(String nama, int tahunPembuatan, int luasSawah, String alamat, String jenisTanaman, String alat) {
        // Memanggil constructor dari superclass KelompokTani
        super(nama, tahunPembuatan, luasSawah, alamat, jenisTanaman);
        this.alat = alat;
    }

    // Accessor
    public String getAlat() {
        return alat;
    }

    // Mutator
    public void setAlat(String alat) {
        this.alat = alat;
    }

    // Override method untuk menampilkan informasi
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method tampilkanInfo dari superclass
        System.out.println("Alat: " + alat);
    }
}

