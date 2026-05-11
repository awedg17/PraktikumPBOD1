/*
 * File         : KembangTelon.java
 * Deskripsi    : Subclass KembangTelon dari Class Kucing
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Piaraan;

public class Kembangtelon extends Kucing {

  public Kembangtelon(String nama, double bobot) {
    super(nama, bobot);
  }

  @Override
  public String toString() {
    return "Kembangtelon: " + this.getNama() + " (" + this.getBobot() + " kg)";
  }
}