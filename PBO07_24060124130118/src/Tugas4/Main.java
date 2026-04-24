/**
 * File         : Main.java
 * Deskripsi    : Program utama Seminar
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas4;

public class Main {
  public static void main(String[] args) {
    Seminar seminar = new Seminar();

    // e. membuat objek
    Dosen d1 = new Dosen("Pak Budi", "D001");
    Dosen d2 = new Dosen("Bu Sari", "D002");

    Mahasiswa m1 = new Mahasiswa("Andi", "M001");
    Mahasiswa m2 = new Mahasiswa("Budi", "M002");
    Mahasiswa m3 = new Mahasiswa("Cici", "M003");
    Mahasiswa m4 = new Mahasiswa("Dodi", "M004");
    Mahasiswa m5 = new Mahasiswa("Eka", "M005");
    
    // c. count peserta
    System.out.println("Total peserta: " + seminar.countPeserta());

    // f. registrasi
    seminar.registrasi(d1);
    seminar.registrasi(d2);
    seminar.registrasi(m1);
    seminar.registrasi(m2);
    seminar.registrasi(m3);
    seminar.registrasi(m4);
    seminar.registrasi(m5);


    // g. tampil peserta
    seminar.tampilPeserta();

    // h. count mahasiswa
    System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

    // i. setter wali
    m1.setWali(d1);
    m2.setWali(d1);
    m3.setWali(d2);

    // j. tampil data mahasiswa
    m1.tampilDataMahasiswa();
    m2.tampilDataMahasiswa();
  }
}