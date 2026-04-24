/**
 * File         : Burung.java
 * Deskripsi    : Subclass Burung
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas3;

public class Burung extends Anabul {
  public Burung(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak terbang");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " bersuara cuit");
  }
}