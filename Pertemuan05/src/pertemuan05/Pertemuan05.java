
package pertemuan05;

/**
 *
 * @author Diansariani 2201010254
 * tgl : 2024-04-26
 */
public class Pertemuan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aritmatika Amatik = new aritmatika();
        int hsltambah = 0;
        
        hsltambah = Amatik.tambah(27, 4);
        System.out.println("hasil: "+hsltambah);
        
        Hitungluassegitiga HLS3 = new Hitungluassegitiga();
        HLS3.SetAlas(5);
        HLS3.SetTinggi(8);
        double hsl = HLS3.HitungLsegi3();
        HLS3.TampilHasil();
    }
    
}
