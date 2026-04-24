/**
 * File         : Anjing.java
 * Deskripsi    : Subclass Anjing
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas3;

public class Anjing extends Anabul {
  public Anjing(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak melata");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " bersuara guk-guk");
  }
}