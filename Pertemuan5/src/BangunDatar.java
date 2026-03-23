/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method di class BangunDatar
 * Pembuat      : Dewangga Ramadhan Halim
 * Tanggal      : 17 Maret 2026 
*/

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

/*  protected int jmlSisi;
    protected String warna;
    protected String border; */

    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna (String warna){
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder (String border){
        this.border = border;
    }

    public double getLuas();
    
    public abstract double getKeliling();

    /* public double getLuas(){
        return 0;
    }

    public double getKeliling(){
        return 0;
    } */

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public static void printCounterBangunDatar(){
    System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public /* final */ void printInfo () {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

