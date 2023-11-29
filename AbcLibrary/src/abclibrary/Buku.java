/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abclibrary;

/**
 *
 * @author owner
 */
public class Buku {
    private int idBuku;
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private boolean statusKetersediaan;

    public Buku(int idBuku, String judul, String pengarang, String nomorISBN) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = true; // Awalnya buku tersedia
    }

    public void pinjamBuku() {
        if (statusKetersediaan) {
            statusKetersediaan = false; // Set status buku menjadi tidak tersedia saat dipinjam
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku \"" + judul + "\" sedang tidak tersedia.");
        }
    }

    public void kembalikanBuku() {
        statusKetersediaan = true; // Set status buku menjadi tersedia saat dikembalikan
        System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
    }

   
}
