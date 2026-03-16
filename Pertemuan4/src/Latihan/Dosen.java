/* Nama File   : Dosen.java
* Deskripsi    : berisi atribut dan method di class Dosen
* Pembuat      : Dewangga Ramadhan Halim
* Tanggal      : 12 Maret 2026
*/

package Latihan;

public class Dosen extends Pegawai {

  protected String fakultas;

  public Dosen(){}

  public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas){
    super(nip, nama, tanggalLahir, tmt, gajiPokok);
    this.fakultas = fakultas;
  }

  public String getFakultas(){
    return fakultas;
  }

  public void printInfo(){
    super.printInfo();
    System.out.println("Fakultas : " + fakultas);
  }
}