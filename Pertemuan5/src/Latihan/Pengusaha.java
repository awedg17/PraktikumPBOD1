/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method di class Pengusaha
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 23 Maret 2026 
*/

package Latihan;

public class Pengusaha extends Manusia {
  private String npwp;
  private static int counterPengusaha = 0;
  private int B = 1;

  public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.npwp = npwp;
    counterPengusaha++;
  }

  public double hitungPajak() {
    return 0.15 * pendapatan;
  }

  @Override
  public int hitungMasaKerja() {
    return super.hitungMasaKerja() + B;
  }

  public static int getCounterPengusaha() {
    return counterPengusaha;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("NPWP: " + npwp);
  }
}