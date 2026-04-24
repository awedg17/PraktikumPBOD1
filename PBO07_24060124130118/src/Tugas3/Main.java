/**
 * File         : Main.java
 * Deskripsi    : File main Anabul
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas3;

public class Main {
  public static void main(String[] args) {
    Anabul kucing = new Kucing("Kucing");
    Anabul anjing = new Anjing("Anjing");
    Anabul burung = new Burung("Burung");

    kucing.gerak();
    kucing.bersuara();

    System.out.println();

    anjing.gerak();
    anjing.bersuara();

    System.out.println();

    burung.gerak();
    burung.bersuara();
  }
}