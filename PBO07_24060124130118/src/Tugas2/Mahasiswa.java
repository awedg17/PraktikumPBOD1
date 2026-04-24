/**
 * File         : Mahasiswa.java
 * Deskripsi    : Class Mahasiswa (Overloading)
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas2;

public class Mahasiswa {
  private String nim;
  private String nama;
  private String programStudi;

  // ===== KONSTRUKTOR =====

  // tanpa parameter
  public Mahasiswa() {
    this.nim = "-999";
    this.nama = "n/a";
    this.programStudi = "n/a";
  }

  // dengan parameter
  public Mahasiswa(String nim, String nama, String programStudi) {
    this.nim = nim;
    this.nama = nama;
    this.programStudi = programStudi;
  }

  // copy constructor
  public Mahasiswa(Mahasiswa m) {
    this.nim = m.nim;
    this.nama = m.nama;
    this.programStudi = m.programStudi;
  }

  // OVERLOADING METHOD 

  // varian 1 (tanpa parameter)
  public void setProgramStudi() {
    this.programStudi = "Kosong";
  }

  // varian 2 (String)
  public void setProgramStudi(String prodi) {
    this.programStudi = prodi;
  }

  // varian 3 (parameter objek Mahasiswa)
  public void setProgramStudi(Mahasiswa m) {
    this.programStudi = m.programStudi;
  }

  // menampilkan info Mahasiswa
  public void tampilData() {
    System.out.println("NIM  : " + nim);
    System.out.println("Nama : " + nama);
    System.out.println("Prodi: " + programStudi);
    System.out.println();
  }
}