/* Nama File   : Pegawai.java
* Deskripsi    : berisi atribut dan method di class Pegawai
* Pembuat      : Dewangga Ramadhan Halim
* Tanggal      : 12 Maret 2026
*/

package Latihan;

public class Pegawai {

  protected String nip;
  protected String nama;
  protected String tanggalLahir;
  protected String tmt;
  protected double gajiPokok;

  public Pegawai(){}

  public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok){
    this.nip = nip;
    this.nama = nama;
    this.tanggalLahir = tanggalLahir;
    this.tmt = tmt;
    this.gajiPokok = gajiPokok;
  }

  public int hitungMasaKerja(){
    int tahunSekarang = 2026;
    int tahunMasuk = Integer.parseInt(tmt.substring(6));
    return tahunSekarang - tahunMasuk;
  }

  public String hitungTanggalPensiun(int bup){
    int tahunLahir = Integer.parseInt(tanggalLahir.substring(6));
    int bulanLahir = Integer.parseInt(tanggalLahir.substring(3,5));

    int bulanPensiun = bulanLahir + 1;
    int tahunPensiun = tahunLahir + bup;

    if(bulanPensiun > 12){
      bulanPensiun = 1;
      tahunPensiun++;
    }
    return String.format("01-%02d-%d", bulanPensiun, tahunPensiun);
  }

  public void printInfo(){
    System.out.println("NIP : " + nip);
    System.out.println("Nama : " + nama);
    System.out.println("Tanggal Lahir : " + tanggalLahir);
    System.out.println("TMT : " + tmt);
    System.out.println("Gaji Pokok : " + gajiPokok);
  }
}