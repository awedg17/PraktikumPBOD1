/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method di class Lingkaran
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 17 Maret 2026 
 */

public class Lingkaran extends BangunDatar implements IResize {
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

  public Lingkaran(double diameter){
    this.jari = diameter / 2;
    setJmlSisi(1);
  }
  
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

  @Override
  public void zoomIn() {
    jari = jari * 1.1;
  }

  @Override
  public void zoomOut() {
    jari = jari * 0.9;
  }

  @Override
  public void zoom(int percent) {
    jari = jari * percent / 100;
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Jari: " + jari);
  }

  public static void printCounterBangunDatar(){
    System.out.println("Method printCounterBangunDatar dari class Lingkaran");
  }
}
