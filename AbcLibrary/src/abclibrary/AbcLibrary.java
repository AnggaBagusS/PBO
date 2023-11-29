/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abclibrary;

/**
 *
 * @author owner
 */
public class AbcLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contoh penggunaan kelas-kelas yang telah diimplementasikan
        Buku buku1 = new Buku(1, "Harry Potter", "J.K. Rowling", "1234567890");
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan(1, "John Doe", "Jl. Contoh No. 123");

        buku1.pinjamBuku(); // Buku dapat dipinjam
        buku1.kembalikanBuku(); // Buku dikembalikan
        anggota1.daftar(); // Anggota baru terdaftar
        anggota1.perpanjangKeanggotaan(); // Keanggotaan diperpanjang
    }
    
}
