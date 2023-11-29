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
public class Notifikasi {
    private int idNotifikasi;
    private int idAnggota;
    private String isiNotifikasi;
    private Date tanggalKirim;

    public Notifikasi(int idNotifikasi, int idAnggota, String isiNotifikasi, Date tanggalKirim) {
        this.idNotifikasi = idNotifikasi;
        this.idAnggota = idAnggota;
        this.isiNotifikasi = isiNotifikasi;
        this.tanggalKirim = tanggalKirim;
    }

    public void kirimNotifikasi() {
        // Implementasi logika pengiriman notifikasi
        System.out.println("Notifikasi dikirim kepada anggota dengan ID: " + idAnggota);
    }
}
