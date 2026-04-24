/**
 * File         : Seminar.java
 * Deskripsi    : Class Seminar
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas4;

public class Seminar {
  private CivitasAkademika[] peserta;
  private int banyakPeserta;

  public Seminar() {
    peserta = new CivitasAkademika[100];
    banyakPeserta = 0;
  }

  // c. count peserta
  public int countPeserta() {
    return banyakPeserta;
  }
  
  // d. registrasi
  public void registrasi(CivitasAkademika c) {
    if (banyakPeserta < 100) {
        peserta[banyakPeserta] = c;
        banyakPeserta++;
    }
  }

  // g. menampilkan peserta
  public void tampilPeserta() {
    for (int i = 0; i < banyakPeserta; i++) {
        System.out.println(peserta[i].getNomor() + " - " + peserta[i].getNama());
    }
    System.out.println();
  }

  // h. count mahasiswa (instanceof)
  public int countMahasiswa() {
    int count = 0;
    for (int i = 0; i < banyakPeserta; i++) {
      if (peserta[i] instanceof Mahasiswa) {
        count++;
      }
    }
    return count;
  }
}