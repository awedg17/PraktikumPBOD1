/**
 * File         : Data.java
 * Deskripsi    : Kelas Generik Data 
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

public class Data<T> {
  private T[] ruang;

    private int banyak;

  public Data() {
    this.ruang = (T[]) new Object[100];
    this.banyak = 0;
  }


  public T getIsi(int posisi) {
    if (posisi < 1 || posisi > 100) {
      throw new IllegalArgumentException("Posisi tidak valid! Harus antara 1 dan 100.");
    }
    return ruang[posisi - 1];
  }


 public void setIsi(int posisi, T obj) {
    if (posisi < 1 || posisi > 100) {
      throw new IllegalArgumentException("Posisi tidak valid! Harus antara 1 dan 100.");
    }
    this.ruang[posisi - 1] = obj;
    this.banyak++;
  }

  public int getSize() {
    return this.banyak;
  }
}