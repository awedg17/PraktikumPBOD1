/* Nama File    : MPegawai.java
 * Deskripsi    : berisi hasil compile dari Pegawai.java
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 12 Maret 2026 
 */

package latihan;

public class MPegawai {

  public static void main(String[] args) {

    DosenTetap dt = new DosenTetap(
      "198765", "Andi", "10-02-1980",
      "01-03-2010", 5000000,
      "Informatika", "12345");

    DosenTamu dtu = new DosenTamu(
      "198766", "Budi", "15-05-1985",
      "01-01-2020", 4500000,
      "Informatika", "54321",
      "31-12-2025");

    Tendik t = new Tendik(
      "198767", "Citra", "20-07-1990",
      "01-06-2015", 4000000,
      "Akademik");

    System.out.println("===== DOSEN TETAP =====");
    dt.printInfo();

    System.out.println("\n===== DOSEN TAMU =====");
    dtu.printInfo();

    System.out.println("\n===== TENDIK =====");
    t.printInfo();
  }
}