/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method di class Manusia
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 23 Maret 2026 
*/

package Latihan;

public class Manusia {
  protected String nama;
  protected String tgl_mulai_kerja;
  protected String alamat;
  protected double pendapatan;

  private static int counterMns = 0;

  public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
    this.nama = nama;
    this.tgl_mulai_kerja = tgl_mulai_kerja;
    this.alamat = alamat;
    this.pendapatan = pendapatan;
    counterMns++;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public static int getCounterMns() {
    return counterMns;
  }

  public void printInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
    System.out.println("Alamat: " + alamat);
    System.out.println("Pendapatan: " + pendapatan);
  }

  public int hitungMasaKerja() {
    int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(6, 10));
    int tahunSekarang = 2026;
    return tahunSekarang - tahunMulai;
  }
}