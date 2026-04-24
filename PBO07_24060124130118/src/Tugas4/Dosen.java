/**
 * File         : Dosen.java
 * Deskripsi    : Subclass Dosen
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas4;

public class Dosen extends CivitasAkademika {
  private String nip;

  public Dosen(String nama, String nip) {
    super(nama);
    this.nip = nip;
  }

  public String getNomor() {
    return nip;
  }
}