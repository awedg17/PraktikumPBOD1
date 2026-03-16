/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method di class Tendik
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

public class Tendik extends Pegawai {

  private String bidang;

  public Tendik(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String bidang){
    super(nip, nama, tanggalLahir, tmt, gajiPokok);
    this.bidang = bidang;
  }

  public double hitungTunjangan(){
    return 0.01 * hitungMasaKerja() * gajiPokok;
  }

  public void printInfo(){
    super.printInfo();
    System.out.println("Bidang : " + bidang);
    System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
    System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun(55));
    System.out.println("Tunjangan : " + hitungTunjangan());
  }
}