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
import java.util.Scanner;

public class PetaniModern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input jumlah kelompok tani dari pengguna
            System.out.print("Masukkan jumlah kelompok tani: ");
            int jumlah = Integer.parseInt(scanner.nextLine());

            // Array untuk menyimpan objek KelompokTani
            KelompokTani[] kelompokTaniArray = new KelompokTani[jumlah];

            // Loop untuk memasukkan informasi setiap kelompok tani
            for (int i = 0; i < jumlah; i++) {
                System.out.print("Masukkan nama Kelompok Tani: ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan tahun pembuatan: ");
                int tahunPembuatan = Integer.parseInt(scanner.nextLine());

                System.out.print("Masukkan luas sawah (Ha): ");
                int luasSawah = Integer.parseInt(scanner.nextLine());

                System.out.print("Masukkan alamat: ");
                String alamat = scanner.nextLine();

                System.out.print("Masukkan jenis tanaman: ");
                String jenisTanaman = scanner.nextLine();

                System.out.print("Apakah kelompok tani ini menggunakan alat modern? (ya/tidak): ");
                String jawaban = scanner.nextLine();

                // Seleksi untuk membuat objek KelompokTani atau KelompokTaniModern
                if (jawaban.equalsIgnoreCase("ya")) {
                    System.out.print("Masukkan alat yang digunakan: ");
                    String alat = scanner.nextLine();
                    kelompokTaniArray[i] = new KelompokTaniModern(nama, tahunPembuatan, luasSawah, alamat, jenisTanaman, alat);
                } else {
                    kelompokTaniArray[i] = new KelompokTani(nama, tahunPembuatan, luasSawah, alamat, jenisTanaman);
                }
            }

            // Menampilkan informasi setiap kelompok tani
            for (KelompokTani kelompok : kelompokTaniArray) {
                kelompok.tampilkanInfo();
                System.out.println("-------------------------");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid, pastikan memasukkan angka yang benar.");
        } finally {
            scanner.close();
        }
    }
}
