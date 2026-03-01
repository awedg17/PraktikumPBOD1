/*
 * Nama File  : Mgaris.java
 * Deskripsi  : berisi  berisi hasil compile dari Garis.java
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 01/03/2026
 */

public class Mgaris {
  public static void main(String[] args) {
    System.out.println("Membuat Titik");
    Titik t1 = new Titik(0,0);
    Titik t2 = new Titik(4,4);
    Titik t3 = new Titik(0,4);
    Titik t4 = new Titik(4,0);

    t1.printTitik();
    t2.printTitik();
    t3.printTitik();
    t4.printTitik();

    System.out.println("\nMembuat Garis");
    Garis g1 = new Garis(t1, t2);
    Garis g2 = new Garis(t3, t4);

    g1.printGaris();
    g2.printGaris();

    // Mencari panjang garis
    System.out.println("\nPanjang g1 = " + g1.getPanjang());
    System.out.println("Panjang g2 = " + g2.getPanjang());

    // Mencari gradien garis
    System.out.println("\nGradien g1 = " + g1.getGradien());
    System.out.println("Gradien g2 = " + g2.getGradien());

    // Mencari titik tengah suatu garis
    System.out.print("\nTitik tengah g1 = ");
    g1.getTitikTengah().printTitik();


    System.out.println("\nMembuat Titik baru");
    Titik t5 = new Titik(0,2);
    Titik t6 = new Titik(4,6);
    Titik t7 = new Titik(0,4);
    Titik t8 = new Titik(4,0);

    t5.printTitik();
    t6.printTitik();
    t7.printTitik();
    t8.printTitik();
    
    System.out.println("\nMembuat Garis baru");
    Garis g3 = new Garis(t5, t6);
    Garis g4 = new Garis(t7, t8);

    g3.printGaris();
    g4.printGaris();

    // cek sejajar
    System.out.println("\ng1 sejajar dengan g2? " + g1.isSejajar(g2));
    System.out.println("g1 sejajar dengan g3? " + g1.isSejajar(g3));

    // cek tegak lurus
    System.out.println("g1 tegak lurus dengan g2? " + g1.isTegakLurus(g2));
    System.out.println("g1 tegak lurus dengan g4? " + g1.isSejajar(g4));

    // persamaan garis y = mx + c
    System.out.println("\n=== Persamaan Garis ===");
    System.out.println("Persamaan g1: " + g1.getPersamaan());
    System.out.println("Persamaan g2: " + g2.getPersamaan());

    // count garis
    System.out.println("\nJumlah objek garis = " + Garis.getCounterGaris());
  }
}
