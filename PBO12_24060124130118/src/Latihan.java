import java.util.LinkedHashMap;
import java.util.Map;

/*
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map, digunakan untuk menampilkan
 *            key dan value berupa NIM dan nama mahasiswa.
 */

public class Latihan {
    public static void main(String[] args) {

      Map<String, String> mahasiswaMap = new LinkedHashMap<>();

      mahasiswaMap.put("24060124130118", "Dewa Halim");
      mahasiswaMap.put("24060124130001", "Adi");
      mahasiswaMap.put("24060124130002", "Bambang");
      mahasiswaMap.put("24060124130003", "Cici");
      mahasiswaMap.put("24060124130004", "Didi");

      mahasiswaMap.forEach((nim, nama) -> {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println();
      });
    }
}