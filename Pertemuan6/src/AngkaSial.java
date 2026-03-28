/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
                  pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 24 Maret 2026 
 */

public class AngkaSial{

  public void cobaAngka(int angka) throws AngkaSialException{
    if(angka==13) {
      throw new AngkaSialException();
    }
    System.out.println(angka+" bukan angka sial");
  }

  public static void main(String[] args){
    AngkaSial as = new AngkaSial();
    try{
      as.cobaAngka(10);
      as.cobaAngka(13);
      as.cobaAngka(12);
    }catch(AngkaSialException ase){
      //method getMessage() telah ada pada kelas "Exception"
      System.out.println(ase.getMessage());
      System.out.println("hati-hati memasukkan angka!!!");
    }
  }
}

/* 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? */

/* Tidak, baris 12 tidak dieksekusi karena ketika terjadi eksepsi pada saat angka 13 diproses, 
program langsung berpindah ke blok catch sehingga perintah setelahnya tidak dijalankan. */

/* Apakah baris 21 pada AngkaSial.java di atas dieksekusi? */

/* Ya, baris 21 dieksekusi karena setelah eksepsi ditangkap oleh blok catch, program akan 
menjalankan perintah yang ada di dalam catch tersebut. */