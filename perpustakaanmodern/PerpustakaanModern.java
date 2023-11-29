/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaanmodern;

import java.time.LocalDate;
import java.util.Date;

public class PerpustakaanModern {

    public static void main(String[] args) {
        Admin admin = new Admin();
        
        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(1, "Rino", "teluk");

        Notifikasi notifikasi = new Notifikasi(1, "Selamat datang di Perpustakaan Modern", new Date(), anggota);

        notifikasi.kirimNotifikasi("Rino");
        
        Buku buku1 = new Buku(1, "Laskar Pelangi", "Andrea Hirata", "8289282480");
           
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(301, LocalDate.now(), LocalDate.now().minusDays(20), buku1, anggota);
   
        admin.tambahBuku(buku1);
        anggota.pinjamBuku("Laskar Pelangi");
        anggota.kembalikanBuku(transaksi1);
        transaksi1.hitungDenda();
        admin.hapusBuku("Harry Potter");
 
    }
}
