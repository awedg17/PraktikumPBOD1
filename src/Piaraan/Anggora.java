/*
 * File         : Anggora.java
 * Deskripsi    : Subclass Anggora dari Class Kucing
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Piaraan;

public class Anggora extends Kucing {
  public Anggora(String nama, double bobot) {
    super(nama, bobot);
  }

  @Override
  public String toString() {
    return "Anggora: " + this.getNama() + " (" + this.getBobot() + " kg)";
  }
}