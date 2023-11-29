/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abclibrary;

import java.util.Date;

/**
 *
 * @author owner
 */
public class TransaksiPeminjam {
    private int idTransaksi;
    private int idAnggota;
    private int idBuku;
    private Date tanggalPeminjaman;
    private int durasiPeminjaman;

    public TransaksiPeminjam(int idTransaksi, int idAnggota, int idBuku, Date tanggalPeminjaman, int durasiPeminjaman) {
        this.idTransaksi = idTransaksi;
        this.idAnggota = idAnggota;
        this.idBuku = idBuku;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public void hitungDenda() {
        // Implementasi logika perhitungan denda
        System.out.println("Denda dihitung untuk transaksi peminjaman dengan ID: " + idTransaksi);
    }

    int getIdTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
