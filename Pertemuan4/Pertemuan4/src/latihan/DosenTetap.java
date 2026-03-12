/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method di class DosenTetap
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 12 Maret 2026 
 */

package latihan;

public class DosenTetap extends Dosen {

  private String nidn;

  public DosenTetap(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas, String nidn) {
    super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
    this.nidn = nidn;
  }

  public double hitungTunjangan() {
    return 0.02 * hitungMasaKerja() * gajiPokok;
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("NIDN : " + nidn);
    System.out.println("Masa Kerja : " + hitungMasaKerja() + " tahun");
    System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun(65));
    System.out.println("Tunjangan : " + hitungTunjangan());
  }
}
