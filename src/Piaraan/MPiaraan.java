package Piaraan;

public class MPiaraan {
  public static void main(String[] args) {
      Piaraan p = new Piaraan();

      p.enqueueAnabul(new Kucing("Bobby", 3.2));
      p.enqueueAnabul(new Anggora("Joko", 4.8));
      p.enqueueAnabul(new Anjing("Guntur"));
      p.enqueueAnabul(new Kembangtelon("Cimi", 5.3));
      p.enqueueAnabul(new Burung("Kicau"));

      System.out.println("Jumlah antrean: " + p.getNbelm());
      System.out.println("Terdepan: " + p.getAnabul().getNama());

      System.out.println("\n--- Daftar Anabul ---");
      p.showAnabul();

      System.out.println("\n--- Jenis Anabul ---");
      p.showJenisAnabul();

      System.out.println("\nJumlah kucing: " + p.countKucing());
      System.out.println("Total bobot kucing: " + p.bobotKucing() + " kg");

      System.out.println("\n--- Melayani Anabul ---");
      System.out.println("Sedang dilayani: " + p.dequeueAnabul().getNama());
      System.out.println("Sedang dilayani: " + p.dequeueAnabul().getNama());

      System.out.println("\n--- Sisa Antrean ---");
      p.showAnabul();
      System.out.println("Sisa antrean: " + p.getNbelm());
    }
}
