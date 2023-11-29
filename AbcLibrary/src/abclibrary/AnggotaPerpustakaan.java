/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abclibrary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author owner
 */
public class AnggotaPerpustakaan {
    private int idAnggota;
    private String nama;
    private String alamat;
    private List<TransaksiPeminjam> sejarahPeminjaman;

    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.sejarahPeminjaman = new ArrayList<>();
    }

    public void daftar() {
        System.out.println("Anggota baru \"" + nama + "\" berhasil terdaftar.");
    }

    public void perpanjangKeanggotaan() {
        System.out.println("Keanggotaan untuk \"" + nama + "\" berhasil diperpanjang.");
    }

   
}
