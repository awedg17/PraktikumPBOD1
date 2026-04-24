/**
 * File         : Coercion.java
 * Deskripsi    : Program Polimorfisme Ad Hoc Coercion
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

package Tugas1;

public class Coercion {
  public static void main(String[] args) {

    // a. ilustrasi coercion int 65
    int a = 65;
    System.out.println("a sebagai Integer: " + a);
    System.out.println("a sebagai Char: " + (char) a);
    System.out.println("a sebagai Double: " + (double) a);

    // b. int -> double -> int
    double real = (double) a;
    int kembali = (int) real;
    System.out.println("a setelah diubah kembali ke int: " + kembali);

    // c. String X dan Y
    String X = "1234";
    String Y = "5678";
    String S = X + Y;
    int Z = Integer.parseInt(X) + Integer.parseInt(Y);

    System.out.println("S (hasil concat): " + S);
    System.out.println("Z (hasil penjumlahan): " + Z);

    // d. String P dan Q
    String P = "12.34";
    String Q = "56.78";
    String R = P + Q;
    double D = Double.parseDouble(P) + Double.parseDouble(Q);

    System.out.println("R (hasil concat): " + R);
    System.out.println("D (hasil penjumlahan): " + D);

    // e. konversi S ke Integer
    int A = Integer.parseInt(S);
    System.out.println("A: " + A);

    // f. konversi A ke String
    String T = Integer.toString(A);
    System.out.println("T: " + T);
  }
}