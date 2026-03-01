/*
 * Nama File  : MTitik.java
 * Deskripsi  : berisi hasil compile dari Titik.java
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 24/02/2026
 */

public class Mtitik {
  public static void main(String[] args) {
    Titik T1 = new Titik();    // Membuat objek titik T1 (0,0)
    T1.setAbsis(3);         // mengubah absis T1 dengan nilai 3
    T1.setOrdinat(4);       // mengubah ordinat T1 dengan nilai 4
    T1.printTitik();          // mencetak koordinat T1 ke layar
    T1.geser (3,4);      // menggeser T1 sejauh (3,4)
    T1.printTitik();          // menampilkan koordinat T1 setelah digeser

    Titik T2 = T1;
    T2.printTitik();
    T1.setAbsis(10);
    T1.setOrdinat(10);
    T2.printTitik();


    Titik T3 = new Titik();       // membuat objek titik T1 (0,0)
    Titik T4 = new Titik(3,5);    // membuat objek titik T2 (3,5)

    T3.printTitik();
    T4.printTitik();
    T1.printcounterTitik();

    
    System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
    System.out.println("Jumlah objek titik = " + T2.getCounterTitik());
   

    Titik T5 = new Titik(-3,5);    // membuat objek titik T2 (3,5)
    Titik T6 = new Titik(-3,-5);    // membuat objek titik T2 (3,5)
    Titik T7 = new Titik(3,-5);    // membuat objek titik T2 (3,5)

    T5.printTitik();
    T6.printTitik();
    T7.printTitik();

  System.out.println("Kuadran T1 = " + T1.getKuadran());
  System.out.println("Kuadran T5 = " + T5.getKuadran());
  System.out.println("Kuadran T6 = " + T6.getKuadran());
  System.out.println("Kuadran T7 = " + T7.getKuadran());

  System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());

  System.out.println("Jarak T1 ke T4 = " + T1.getJarak(T4));

  T5.refleksiX();
  System.out.println("Hasil refleksi T5 dengan sumbu X =" );
  T5.printTitik();

  T5.refleksiY();
  System.out.println("Hasil refleksi T5 dengan sumbu Y =" );
  T5.printTitik();

  Titik T8 = T6.getRefleksiX();
  System.out.println("Titik baru hasil dari refleksi T6 dengan sumbu X =" );
  T8.printTitik();

  Titik T9 = T7.getRefleksiY();
  System.out.println("Titik baru hasil dari refleksi T7 dengan sumbu Y =" );
  T9.printTitik();
  }
}
