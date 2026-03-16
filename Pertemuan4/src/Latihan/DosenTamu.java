/* Nama File   : DosenTamu.java
* Deskripsi    : berisi atribut dan method di class DosenTamu
* Pembuat      : Dewangga Ramadhan Halim
* Tanggal      : 12 Maret 2026
*/

package Latihan;

public class DosenTamu extends Dosen {

  private String nidk;
  private String tanggalBerakhirKontrak;

  public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas, String nidk, String tanggalBerakhirKontrak){
    super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
    this.nidk = nidk;
    this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
  }

  public double hitungTunjangan(){
    return 0.025 * gajiPokok;
  }

  public void printInfo(){
    super.printInfo();
    System.out.println("NIDK : " + nidk);
    System.out.println("Tanggal Berakhir Kontrak : " + tanggalBerakhirKontrak);
    System.out.println("Tunjangan : " + hitungTunjangan());
  }
}