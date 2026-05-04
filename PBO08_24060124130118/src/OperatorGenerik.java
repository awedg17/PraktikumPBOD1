/**
 * File         : OperatorGenerik.java
 * Deskripsi    : Kelas Generik 
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

public class OperatorGenerik {

    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // c) Fungsi generik Bobot2: upper bounded generic (hanya Kucing dan turunannya)
    public static <T extends Kucing> double bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}