/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi compile BangunDatar
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 17 Maret 2026 
 */

public class MBangunDatar {

  public static void main(String[] args) {
    
    /* BangunDatar B1 = new BangunDatar(); */
    BangunDatar P1 = new Persegi(10);
    Persegi P2 = new Persegi(5);

    BangunDatar L1 = new Lingkaran(7);
    Lingkaran L2 = new Lingkaran (14);

    // BangunDatar b = new BangunDatar();

    // /* Kesalahan: Pemanggilan constructor yang tidak sesuai */

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

    System.out.println("Apakah luas sama? " + P1.isEqualLuas(L1));
    System.out.println("Apakah keliling sama? " + P1.isEqualKeliling(L1));

    /* Bagian 1 No 5
    Apakah method isEqualLuas dan isEqualKeliling dapat digunakan untuk membandingkan 
    objek bangun datar yang berbeda? */

    /* Bisa, karena parameter yang digunakan sama, yaitu bertipe BangunDatar. Method
    getLuas() dan getKeliling() menggunakan konsep polymorphism, artinya implementasi method
    akan dijalankan sesuai dengan jenis objeknya. */

    /* Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method 
    isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa? */

    /* Bisa meskipun BangunDatar bukan abstract class karena method tersebut hanya membandingkan
    hasil dari getLuas() dan getKeliling(). Tapi, jika BangunDatar tidak abstract, maka method 
    getLuas() dan getKeliling() harus punya implementasi.*/

    /* Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada 
    non-abstract class? */

    /* Kelebihannya adalah bisa memaksa tiap subclass untuk mengimplementasikan method getLuas()
    dan getKeliling() sesuai bentuk masing-masing. Penggunaan abstract class juga mencegah 
    pembuatan objek dari BangunDatar secara langsung, sehingga terhindar dari penggunaan objek yang
    tak bermakna. */

    /* Bagian 2 no 4
    Lakukan eksperimen pemanggilan method yang telah dibuat dari IResize pada main method. 
    Bagaimana hasilnya?*/

    System.out.println("Sisi awal: " + p.getSisi());
    p.zoomIn();
    System.out.println("Setelah zoomIn: " + p.getSisi());

    p.zoomOut();
    System.out.println("Setelah zoomOut: " + p.getSisi());

    p.zoom(200);
    System.out.println("Setelah zoom 200%: " + p.getSisi());


    System.out.println("Jari-jari awal: " + l.getJari());
    l.zoomIn();
    System.out.println("Setelah zoomIn: " + l.getJari());

    l.zoomOut();
    System.out.println("Setelah zoomOut: " + l.getJari());

    l.zoom(50);
    System.out.println("Setelah zoom 50%: " + l.getJari());

    /* Setelah memanggil method tersebut, nilai sisi dan jari-jari pada lingkaran berubah sesuai
    dengan operasi yang dilakukan. */

    /* Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface 
    IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar? */

    /* Keuntungannya adalah sifat interface yang fleksibel karena dapat diimplementasikan oleh 
    berbagai class yang tidak harus terikat pada pewarisan class tertentu.*/
  }
}
