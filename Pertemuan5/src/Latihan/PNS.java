/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method di class PNS
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 23 Maret 2026 
*/

package Latihan;

public class PNS extends Manusia {
  private String nip;
  private static int counterPNS = 0;
  private int A = 8; 

  public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.nip = nip;
    counterPNS++;
  }

  public double hitungPajak() {
    return 0.1 * pendapatan;
  }

  @Override
  public int hitungMasaKerja() {
    return super.hitungMasaKerja() + A;
  }

  public static int getCounterPNS() {
    return counterPNS;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("NIP: " + nip);
  }
}