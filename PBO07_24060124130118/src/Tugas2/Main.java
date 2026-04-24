/**
 * File         : Main.java
 * Deskripsi    : Program utama Overloading Mahasiswa
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas2;

public class Main {
  public static void main(String[] args) {

    Mahasiswa m1 = new Mahasiswa();
    m1.setProgramStudi();
    m1.tampilData();

    Mahasiswa m2 = new Mahasiswa();
    m2.setProgramStudi("Informatika");
    m2.tampilData();

    Mahasiswa m3 = new Mahasiswa();
    m3.setProgramStudi(m2);
    m3.tampilData();

    Mahasiswa m4 = new Mahasiswa("24060126120333", "Budi", "Sistem Informasi");
    m4.tampilData();

    Mahasiswa m5 = new Mahasiswa(m4);
    m5.tampilData();
  }
}