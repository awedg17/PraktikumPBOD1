/**
 * File         : Teman.java
 * Pembuat      : Dewangga Ramadhan Halim - 24060124130118
 * Lab          : D1
 */

public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Dewa");
        t.addNama("Ani");
        t.addNama("Rani");
        t.addNama("Budi"); 

        t.showTeman();
        System.out.println("Jumlah teman: " + t.getNbelm()); 
        System.out.println("Indeks ke-1: " + t.getNama(1)); 

        t.setNama("Dewi", 1);
        System.out.println("Setelah setNama: " + t.getNama(1)); 

        System.out.println("Apakah Ani ada? " + t.isMember("Ani")); 
        System.out.println("Apakah Rani ada? " + t.isMember("Rani"));     

        t.gantiNama("Rani", "Cinta");
        t.showTeman();

        System.out.println("Budi muncul: " + t.countNama("Budi") + "x"); 
        t.delNama("Budi"); 
        System.out.println("Setelah Budi dihapus: ");
        t.showTeman();
    }
}
