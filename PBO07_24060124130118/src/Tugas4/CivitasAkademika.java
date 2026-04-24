/**
 * File         : CivitasAkademika.java
 * Deskripsi    : Superclass Civitas Akademika
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas4;

public abstract class CivitasAkademika {
  protected String nama;

  public CivitasAkademika(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public abstract String getNomor();
}