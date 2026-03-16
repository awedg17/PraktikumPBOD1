/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method di class Lingkaran
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 10 Maret 2026 
 */

public class Lingkaran extends BangunDatar {
  private double jari;

  public Lingkaran (){
    setJmlSisi(1);
  }

  /* public Lingkaran(double diameter, String warna, String border){
    this.jari = diameter / 2;
    setWarna(warna);
    setBorder(border);
    setJmlSisi(1);
  } */

  public Lingkaran(double diameter, String warna, String border){
    super(1, warna, border);
    this.jari = diameter/2;
  }

  public double getJari(){
    return jari;
  }

  public void setJari(double jari) {
    this.jari = jari;
  }

  public double getLuas(){
    return Math.PI * Math.pow(jari, 2);
  }

  public double getKeliling(){
    return Math.PI * (2 * jari);
  }

 /*  @Override
  public void printInfo(){
    System.out.println("Jumlah sisi: " + getJmlSisi());
    System.out.println("Warna: " + getWarna());
    System.out.println("Border: " + getBorder());
    System.out.println("Jari: " + jari);
  } */

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Jari: " + jari);
  }

  public static void printCounterBangunDatar(){
    System.out.println("Method printCounterBangunDatar dari class Lingkaran");
  }
}
