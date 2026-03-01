/*
 * Nama File  : Garis.java
 * Deskripsi  : berisi atribut dan method dalam class Garis
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 01/03/2026
 */

public class Garis {
  private Titik titikAwal;
  private Titik titikAkhir;
  private static int counterGaris = 0;

  /* ================== KONSTRUKTOR ================== */

  // a. Tanpa parameter dengan titik awal (0,0) dan titik akhir dengan (1,1).
  public Garis() {
    this.titikAwal = new Titik(0,0);
    this.titikAkhir = new Titik(1,1);
    counterGaris++;
  }

  // b. Menggunakan parameter masukan titik awal dan akhir.
  public Garis(Titik t1, Titik t2) {
    this.titikAwal = new Titik(t1.getAbsis(), t1.getOrdinat());
    this.titikAkhir = new Titik(t2.getAbsis(), t2.getOrdinat());
    counterGaris++;
  }

  /* ================== SELEKTOR & MUTATOR ================== */

  public Titik getTitikAwal() {
    return titikAwal;
  }

  public Titik getTitikAkhir() {
    return titikAkhir;
  }

  public void setTitikAwal(Titik t) {
    this.titikAwal = new Titik(t.getAbsis(), t.getOrdinat());
  }

  public void setTitikAkhir(Titik t) {
    this.titikAkhir = new Titik(t.getAbsis(), t.getOrdinat());
  }

  public static int getCounterGaris() {
    return counterGaris;
  }

  /* ================== METHOD ================== */

  // d. Mendapatkan panjang garis
  public double getPanjang() {
    return titikAwal.getJarak(titikAkhir);
  }

  // e. Mendapatkan gradien sebuah garis
  public double getGradien() {
    double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
    double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
    return dy / dx;
  }

  // f. Mendapatkan titik tengah dari sebuah garis
  public Titik getTitikTengah() {
    double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
    double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
    return new Titik(x, y);
  }

  // g. Mengecek apakah garis tersebut sejajar dengan garis lainnya
  public boolean isSejajar(Garis G) {

  double dx1 = titikAkhir.getAbsis() - titikAwal.getAbsis();
  double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();

  if (dx1 == 0 && dx2 == 0) {
    return true;
  }
  if (dx1 == 0 || dx2 == 0) {
      return false;
  }

  return Math.abs(this.getGradien() - G.getGradien()) < 1e-9; 
  }

  // h. Mengecek apakah garis tegak lurus dengan garis lainnya
  public boolean isTegakLurus(Garis G) {

    double dx1 = titikAkhir.getAbsis() - titikAwal.getAbsis();
    double dy1 = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

    double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
    double dy2 = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();

    return (dx1 * dx2 + dy1 * dy2) == 0;
  }

  // i. Menampilkan titik awal & akhir garis
  public void printGaris() {
    System.out.println("Titik Awal: ");
    titikAwal.printTitik();
    System.out.println("Titik Akhir: ");
    titikAkhir.printTitik();
  }

  // j. Menampilkan persamaan garis y = mx + c
  public String getPersamaan() {
    double m = getGradien();
    double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();

    return "y = " + m + "x + " + c;
  }
}