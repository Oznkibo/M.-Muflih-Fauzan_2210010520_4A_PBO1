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
public class KelompokTani {
    // Atribut
    private String nama;
    private int tahunPembuatan;
    private int luasSawah;
    private String alamat;
    private String jenisTanaman;

    // Constructor
    public KelompokTani(String nama, int tahunPembuatan, int luasSawah, String alamat, String jenisTanaman) {
        this.nama = nama;
        this.tahunPembuatan = tahunPembuatan;
        this.luasSawah = luasSawah;
        this.alamat = alamat;
        this.jenisTanaman = jenisTanaman;
    }

    // Accessor
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

    // Mutator
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

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama Kelompok Tani: " + nama);
        System.out.println("Tahun Pembuatan: " + tahunPembuatan);
        System.out.println("Luas Sawah: " + luasSawah + " Ha");
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Tanaman: " + jenisTanaman);
    }
}
