/**
 * File         : Main.java
 * Deskripsi    : File main Anabul
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

public class Main {

  public static void main(String[] args) {

    // Kamus Lokal
    Datum<Kucing> k1, k2;
    Datum<Anabul> an1;

    Datum<Integer> a, b;

    Datum<String> s1, s2;

    Data<Anabul> kelompokAnabul;
    Data<Kucing> kelompokKucing;

    // Inisialisasi

    k1 = new Datum<>();
    k2 = new Datum<>();

    an1 = new Datum<>();

    a = new Datum<>();
    b = new Datum<>();

    s1 = new Datum<>();
    s2 = new Datum<>();

    kelompokAnabul = new Data<>();
    kelompokKucing = new Data<>();

    // Generik pada Class

    System.out.println("\n=== Tugas I: GENERIK PADA CLASS ===");

    k1.setIsi(new Anggora("Asep", 5.6));
    k2.setIsi(new Kembangtelon("Siti", 4.5));
    an1.setIsi(new Anjing("Loki"));

    System.out.println(k1.getIsi().toString());
    System.out.println(k2.getIsi().toString());
    System.out.println(an1.getIsi().getNama());

    // Generik pada Operator
    System.out.println("\n=== Tugas II: GENERIK PADA OPERATOR ===");

    // Tukar Integer
    a.setIsi(17);
    b.setIsi(77);

    System.out.println("- Integer");
    System.out.println("Sebelum ditukar: a = " + a.getIsi() + " dan b = " + b.getIsi());
    OperatorGenerik.tukar(a, b);
    System.out.println("Sesudah ditukar: a = " + a.getIsi() + " dan b = " + b.getIsi());

    // Tukar String
    s1.setIsi("Dewa");
    s2.setIsi("Kuliah");
    
    System.out.println("- String");
    System.out.println("Sebelum ditukar: a = " + s1.getIsi() + " dan b = " + s2.getIsi());
    OperatorGenerik.tukar(s1, s2);
    System.out.println("Sesudah ditukar: a = " + s1.getIsi() + " dan b = " + s2.getIsi());

    // Tukar Sesama Keluarga Anabul
    System.out.println("- Keluarga anabul (Kucing)");
    System.out.println("Sebelum ditukar: a = " + k1.getIsi().getNama() + " dan b = " + k2.getIsi().getNama());
    OperatorGenerik.tukar(k1, k2);
    System.out.println("Sesudah ditukar: a = " + k1.getIsi().getNama() + " dan b = " + k2.getIsi().getNama());

    // Bobot kucing
    double totalBobot = OperatorGenerik.bobot2(
      k1.getIsi(),
      k2.getIsi());

    System.out.println("Total bobot " + k1.getIsi().getNama() + " dan " + k2.getIsi().getNama() + ": " + totalBobot + " kg");

    // Generik pada Data
    System.out.println("\n=== Tugas III: GENERIK PADA DATA ===");

    kelompokAnabul.setIsi(1, new Anggora("Jamal", 4.2));
    kelompokAnabul.setIsi(2, new Kembangtelon("Kara", 4.4));
    kelompokAnabul.setIsi(3, new Anjing("Dexter"));
    kelompokAnabul.setIsi(4, new Burung("Cau"));

    System.out.println("Isi Data (Anabul) di posisi 1: " + kelompokAnabul.getIsi(1));
    System.out.println("Isi Data (Anabul) di posisi 2: " + kelompokAnabul.getIsi(2));
    System.out.println("Isi Data (Anabul) di posisi 3: " + kelompokAnabul.getIsi(3).getNama());
    System.out.println("Isi Data (Anabul) di posisi 4: " + kelompokAnabul.getIsi(4).getNama());

    System.out.println("Total Isi Data Anabul: " + kelompokAnabul.getSize());

    kelompokKucing.setIsi(1, new Anggora("Lisa", 5.1));
    kelompokKucing.setIsi(2, new Kembangtelon("Sela", 4.7));

    System.out.println("\nIsi Data (Kucing) di posisi 1: " + kelompokKucing.getIsi(1));
    System.out.println("Isi Data (Kucing) di posisi 2: " + kelompokKucing.getIsi(2));

    System.out.println("Total Isi Data Kucing: " + kelompokKucing.getSize());

    // Bobot dari dua kucing di Data
    double totalBobotKucing = OperatorGenerik.bobot2(
      kelompokKucing.getIsi(1),
      kelompokKucing.getIsi(2));
      System.out.println("Total bobot kucing di Data: " + totalBobotKucing + " kg");
  }
}