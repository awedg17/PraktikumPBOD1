/*
 * File         : KembangTelon.java
 * Deskripsi    : Subclass KembangTelon dari Class Kucing
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

public class Datum<T> {
  private T isi;

  public Datum() {}

  public T getIsi() {
    return isi;
  }

  public void setIsi(T isiBaru) {
    this.isi = isiBaru;
  }
}
