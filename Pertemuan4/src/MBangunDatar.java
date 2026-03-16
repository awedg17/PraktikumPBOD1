/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi compile BangunDatar
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 10 Maret 2026 
 */

public class MBangunDatar {

  public static void main(String[] args) {
    
    Persegi p = new Persegi(4, "Merah", "Biru");

    System.out.println("Luas Persegi: " + p.getLuas());
    System.out.println("Keliling Persegi: " + p.getKeliling());
    System.out.println("Diagonal Persegi: " + p.getDiagonal());

    p.printInfo();

    System.out.println();

    Lingkaran l = new Lingkaran (7, "Kuning", "Hijau");

    System.out.println("Luas Lingkaran: " + l.getLuas());
    System.out.println("Keliling Lingkaran: " + l.getKeliling());

    l.printInfo();

    /* Bagian 1
    Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
    Mengapa?

    public Persegi(double sisi, String warna, String border){
      this.jmlSisi = 4;
      this.warna = warna;
      this.border = border;
      this.sisi = sisi;
    } 
      
    Tidak dapat direalisasikan karena atribut-atribut itu memliki accees modifier private,
    sehingga tidak bisa diakses langsung oleh subclass Persegi.
    */

   
    /* Bagian 3
    Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?*/
    
    BangunDatar.printCounterBangunDatar();
    Lingkaran.printCounterBangunDatar();
   
    /* Method static tidak dapat dioverride. Karena ketika method static dengan nama
    yang sama dibuat pada subclass, method tersebut tidak meng-override method pada superclass.\
    Method yang dijalankan bergzntung pada class yang memanggilnya */

    /*Bagian 4
    Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
    tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
    Mengapa? 
    
    public Persegi(double sisi, String warna, String border){
      this.jmlSisi = 4;
      this.warna = warna;
      this.border = border;
      this.sisi = sisi;
    }
    
    Setelah atribut class BangunDatar diubah menjadi proteted, kosntruktor tersebut dapat direalisasikan
    karena atribut-atribut tersebut dapat diakses langsung oleh sublass Persegi.
    */

    /* Bagian 5
    Lakukan eksperimen penggunaan keyword final seperti berikut:
    1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
    Persegi dan Lingkaran?
    */

    /* Pada subclass Persegi dan Lingkaran tidak dapat mewariskan class BangunDatar. Jadi, class Persegi
    dan Lingkaran yang melakukan extends BangunDatar akann error karena pewarisan dari class final tidak
    diperbolehkan. */


    /* 
    2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada
    method printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method
    printInfo() pada kelas Persegi dan Lingkaran?
    */

   /*Akan terjadi error karena mencoba melakukan overriding terhadap method final.*/
  }
}
