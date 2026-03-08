/*
 * Nama File  : Kendaraan.java
 * Deskripsi  : berisi atribut dan method dalam class Kendaraan
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 24/02/2026
 */

public class Kendaraan {
  /*************** ATRIBUT ***************/
  private String noPlat;
  private String jenis;

  /*************** METHOD ***************/
  // Konstruktor  Kendaraan dengan parameter kosong
  public Kendaraan(){
    this.noPlat = "";
    this.jenis = "";
  }

  // Konstruktor Kendaraan dengan parameter noPlat dan jenis
  public Kendaraan(String noPlat, String jenis){
    this.noPlat = noPlat;
    this.jenis = jenis;
  }

  public String getNoPlat(){
    return noPlat;
  }

  public String getJenis(){
    return jenis;
  }

  public void setNoPlat(String noPlat){
    this.noPlat = noPlat;
  }

  public void setJenis(String jenis){
    this.jenis = jenis;
  }

  public void printKendaraan(){
    System.out.println("No Plat : " + noPlat);
    System.out.println("Jenis   : " + jenis);
  }
}
