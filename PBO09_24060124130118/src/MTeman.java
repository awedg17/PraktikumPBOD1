/*
 * File         : MTeman.java
 * Pembuat      : Dewangga Ramadhan Halim / 24060124130118
 * Tanggal      : 11 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {

        Teman t = new Teman();
        t.addNama("Dewa");
        t.addNama("Dewi");
        t.addNama("Dewo");
        t.addNama("Angga"); 

        t.showTeman();
        System.out.println("Jumlah teman: " + t.getNbelm()); 
        System.out.println("Indeks ke-1: " + t.getNama(1)); 

        t.setNama("Tarno", 1);
        System.out.println("Setelah setNama: " + t.getNama(1)); 

        System.out.println("Apakah Dewi ada? " + t.isMember("Citra")); 
        System.out.println("Apakah Tarno ada? " + t.isMember("Ani"));     

        t.gantiNama("Dewo", "Demoy");
        System.out.println("Setelah ganti nama (Dewo -> Demoy): ");
        t.showTeman();

        System.out.println("Angga muncul: " + t.countNama("Angga") + "x"); 
        t.delNama("Angga"); 
        System.out.println("Setelah Angga dihapus: ");
        t.showTeman();
    }
}