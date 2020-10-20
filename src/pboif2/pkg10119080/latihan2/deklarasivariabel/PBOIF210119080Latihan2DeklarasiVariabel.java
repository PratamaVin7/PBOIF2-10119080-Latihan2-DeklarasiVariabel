/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan2.deklarasivariabel;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */
public class PBOIF210119080Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //Konstanta Uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi Nilai Ke Variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter ='D';

        //Menampilkan Hasil
        System.out.println();
        System.out.println("Isi Variabel Nilai = " + nilaiInt);
        System.out.println("Isi Variabel PHI = " + PHI);
        System.out.println("Isi Variabel Logika = " + nilaiLogika);
        System.out.println("Isi Variabel Karakter = " + nilaiKarakter);   
    }
    
}
