/**
 * File         : Mahasiswa.java
 * Deskripsi    : Subclass Mahasiswa
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas4;

public class Mahasiswa extends CivitasAkademika {
  private String nim;
  private Dosen dosenWali;

  public Mahasiswa(String nama, String nim) {
    super(nama);
    this.nim = nim;
  }

  public String getNomor() {
    return nim;
  }
  
  public void setWali(Dosen d) {
    this.dosenWali = d;
  }

  // j. menampilkan info data mahasiswa
  public void tampilDataMahasiswa() {
    System.out.println("NIM   : " + nim);
    System.out.println("Nama  : " + nama);
    System.out.println("Wali  : " + (dosenWali != null ? dosenWali.getNama() : "-"));
    System.out.println();
  }
}