/*
 * Nama File  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 03/03/2026
 */

public class Dosen {

  /*************** ATRIBUT ***************/

  private String nip;
  private String nama;
  private String prodi;

  /*************** METHOD ***************/

  // Konstruktor Dosen tanpa parameter
  public Dosen(){
    this.nip = "";
    this.nama = "";
    this.prodi = "";
  }

  // Konstruktor Dosen dengan parameter nip, nama, dan prodi
  public Dosen(String nip, String nama, String prodi){
    this.nip = nip;
    this.nama = nama;
    this.prodi = prodi;
  }

  public String getNip(){
    return nip;
  }

  public String getNama(){
    return nama;
  }

  public String getProdi(){
    return prodi;
  }

  public void setNip(String NIP){
    this.nip = NIP;
  }

  public void setNama(String nama){
    this.nama = nama;
  }

  public void setProdi(String prodi){
    this.prodi = prodi;
  }

  public void printDosen(){
    System.out.println("NIP   : " + nip);
    System.out.println("Nama  : " + nama);
    System.out.println("Prodi : " + prodi);
  }
}
