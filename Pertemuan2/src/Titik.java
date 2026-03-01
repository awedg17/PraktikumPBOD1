/*
 * Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Dewangga Ramadhan Halim 
 * Tanggal    : 24/02/2026
 */

public class Titik {
    /*************** ATRIBUT ***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

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
    static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis (){
        return absis;
    }

     // Mengembalikan nilai ordinat
    double getOrdinat (){
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis (double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru x
    void setOrdinat (double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    // Mencetak koordinat titik
    public void printTitik (){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Mencetak jumlah objek titik
    void printcounterTitik(){
        System.out.println(this.counterTitik);
    }

    // Mencari kuadran dari titik tertentu
    int getKuadran(){
    if (absis > 0 && ordinat > 0) return 1;
    else if (absis < 0 && ordinat > 0) return 2;
    else if (absis < 0 && ordinat < 0) return 3;
    else if (absis > 0 && ordinat < 0) return 4;
    else return 0; // di sumbu
    }

    // Mencari jarak dari titik tertentu ke titik pusat
    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, absis) + Math.pow(ordinat, ordinat));
    }

    // Mencari jarak dari titik a ke titik b
    double getJarak(Titik T){
    return Math.sqrt(Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat, 2));
    }

    // Merefleksikan titik dengan sumbu X
    void refleksiX(){
        this.ordinat = -this.ordinat;
    }    

    // Merefleksikan titik dengan sumbu Y
    void refleksiY(){
        this.absis = -this.absis;
    }

    // Membuat titik baru yang sudah direfleksikan dengan sumbu X
    Titik getRefleksiX(){
    return new Titik(this.absis, -this.ordinat);
    }

    // Membuat titik baru yang sudah direfleksikan dengan sumbu Y
    Titik getRefleksiY(){
    return new Titik(-this.absis, this.ordinat);
}
}
