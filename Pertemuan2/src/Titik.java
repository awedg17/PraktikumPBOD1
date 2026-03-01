/*
 * Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 24/02/2026
 */

public class Titik {
    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*************** METHOD ***************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik (){
        this(0,0);
    }

    // Konstruktor untuk membuat titik dengan nilai absis, ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis (){
        return absis;
    }

     // Mengembalikan nilai ordinat
    public double getOrdinat (){
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis (double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru x
    public void setOrdinat (double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    // Mencetak koordinat titik
    public void printTitik (){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Mencetak jumlah objek titik
    public void printcounterTitik(){
        System.out.println(this.counterTitik);
    }

    // Mencari kuadran dari titik tertentu
    public int getKuadran(){
    if (absis > 0 && ordinat > 0) return 1;
    else if (absis < 0 && ordinat > 0) return 2;
    else if (absis < 0 && ordinat < 0) return 3;
    else if (absis > 0 && ordinat < 0) return 4;
    else return 0; // di sumbu
    }

    // Mencari jarak dari titik tertentu ke titik pusat
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Mencari jarak dari titik a ke titik b
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat, 2));
    }

    // Merefleksikan titik dengan sumbu X
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }    

    // Merefleksikan titik dengan sumbu Y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    // Membuat titik baru yang sudah direfleksikan dengan sumbu X
    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    // Membuat titik baru yang sudah direfleksikan dengan sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
}
}
