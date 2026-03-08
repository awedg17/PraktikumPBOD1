/*
 * Nama File  : Mahasiswa.java
 * Deskripsi  : berisi atribut dan method dalam class Mahasiswa
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 03/03/2026
 */

import java.util.ArrayList;

public class Mahasiswa {

    /*************** ATRIBUT ***************/

    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;
    /*************** METHOD ***************/

    // Konstruktor mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();  // Inisialisasi ArrayList kosong
    }

    // Konstruktor dengan parameter nim, nama, dan prodi
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenwali(){
        return dosenwali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNim(String NIM){
        this.nim = NIM;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenwali(Dosen dosenwali){
        this.dosenwali = dosenwali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul (MataKuliah newMataKul){
        listMatkul.add(newMataKul);
    }
    
    public int getJumlahSKS(){
        int total = 0;
        for(int i = 0; i < listMatkul.size(); i++){
            total += listMatkul.get(i).getSKS();
        }
        return total;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi); 
    }

    public void printDetailMhs(){
        printMhs();
        System.out.println("\nDaftar mata kuliah yang diambil:");
        for (int i = 0; i < listMatkul.size(); i++){
            System.out.println(
                listMatkul.get(i).getIdMatkul() + " - " +
                listMatkul.get(i).getNama()
            );
        }
        System.out.println("\nDosen wali:");
        if(dosenwali != null){
            dosenwali.printDosen();
        }

        System.out.println("\nKendaraan:");
        if(kendaraan != null){
            kendaraan.printKendaraan();  
        }
    }
}
