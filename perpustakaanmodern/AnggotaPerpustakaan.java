/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanmodern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class AnggotaPerpustakaan {
    private int idAnggota;
    private String nama;
    private String alamat;
    private List <TransaksiPeminjaman> sejarahPeminjaman;

    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat, List<TransaksiPeminjaman> sejarahPeminjaman) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.sejarahPeminjaman = sejarahPeminjaman;
    }
    
    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.sejarahPeminjaman = new ArrayList<>();
    }
    

    public int getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public List<TransaksiPeminjaman> getSejarahPeminjaman() {
        return sejarahPeminjaman;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setSejarahPeminjaman(List<TransaksiPeminjaman> sejarahPeminjaman) {
        this.sejarahPeminjaman = sejarahPeminjaman;
    }
    
    public void pinjamBuku(String judulBuku) {
        System.out.println("Buku \"" + judulBuku + "\" berhasil dipinjam");
    }

    public void kembalikanBuku (TransaksiPeminjaman transaksi){
    System.out.println("Buku \"" + transaksi.getBukuDipinjam().getJudul() + "\" Telah Dikembalikan.");
    System.out.println();
    }
}

