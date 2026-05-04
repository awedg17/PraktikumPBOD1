/**
 * File         : Kucing.java
 * Deskripsi    : Subclass Kucing
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

public class Kucing extends Anabul {

  protected double bobot; // berat dalam kilogram

  public Kucing(String nama, double bobot) {
    super(nama);
    this.bobot = bobot;
  }

  public double getBobot() {
    return this.bobot;
  }

  public void setBobot(double bobot) {
    this.bobot = bobot;
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak melata");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " bersuara meong");
  }
}
