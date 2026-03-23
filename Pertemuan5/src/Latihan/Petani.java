/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method di class Petani
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 23 Maret 2026 
*/

package Latihan;

public class Petani extends Manusia {
  private String lokasi;
  private static int counterPetani = 0;
  private int C = 1; 

  public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String lokasi) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.lokasi = lokasi;
    counterPetani++;
  }

  public double hitungPajak() {
    return 0;
  }

  @Override
  public int hitungMasaKerja() {
    return super.hitungMasaKerja() + C;
  }

  public static int getCounterPetani() {
    return counterPetani;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Lokasi: " + lokasi);
  }
}