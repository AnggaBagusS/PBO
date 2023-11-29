/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abclibrary;

/**
 *
 * @author owner
 */
public class Admin {
    private int idAdmin;
    private String namaAdmin;

    public Admin(int idAdmin, String namaAdmin) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
    }

    public void kelolaBuku() {
        // Implementasi logika pengelolaan buku
        System.out.println("Admin \"" + namaAdmin + "\" melakukan pengelolaan buku.");
    }

    public void kelolaAnggota() {
        // Implementasi logika pengelolaan anggota perpustakaan
        System.out.println("Admin \"" + namaAdmin + "\" melakukan pengelolaan anggota perpustakaan.");
    }
}
