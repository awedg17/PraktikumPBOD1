/*
 * Nama File  : MataKuliah.java
 * Deskripsi  : berisi atribut dan method dalam class MataKuliah
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 03/03/2026
 */

public class MataKuliah {

  /*************** ATRIBUT ***************/

  private String idMatkul;
  private String nama;
  private int sks;

  /*************** METHOD ***************/

  // Konstruktor MataKuliah tanpa parameter
  public MataKuliah(){
    this.idMatkul = "";
    this.nama = "";
    this.sks = 0;
  }

  // Konstruktor dengan parameter idMatkul, nama, dan sks
  public MataKuliah(String idMatkul, String nama, int sks){
    this.idMatkul = idMatkul;
    this.nama = nama;
    this.sks = sks;
  }

  public String getIdMatkul(){
    return idMatkul;
  }

  public String getNama(){
    return nama;
  }

  public int getSKS(){
    return sks;
  }

  public void setIdMatkul(String idMatkul){
    this.idMatkul = idMatkul;
  }

  public void setNama(String nama){
    this.nama = nama;
  }

  public void setSKS(int SKS){
    this.sks = SKS;
  }
}

