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
public class TransaksiPengembalian {
    private int idTransaksi;
    private int idTransaksiPeminjam;
    private Date tanggalPengembalian;

    public TransaksiPengembalian(int idTransaksi, int idTransaksiPeminjam, Date tanggalPengembalian) {
        this.idTransaksi = idTransaksi;
        this.idTransaksiPeminjam = idTransaksiPeminjam;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void hitungDenda() {
        // Implementasi logika perhitungan denda
        System.out.println("Denda dihitung untuk transaksi pengembalian dengan ID: " + idTransaksi);
    }
}
