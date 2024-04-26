/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan05;

/**
 *
 * @author Diansariani 2201010254
 * tgl : 2024-04-26
 */
public class Hitungluassegitiga {
    double Alas, Tinggi, Luas;
    
    void SetAlas(double Nilai){
        Alas = Nilai;
    }
    void SetTinggi(double Nilai){
        Tinggi = Nilai;
    }
    double GetAlas(){
        return Alas;
    }
    double GetTinggi(){
        return Tinggi;
    }
    double HitungLsegi3(){
        double hsl = (Alas*Tinggi) / 2;
        return hsl;
    }
    
    void TampilHasil(){
        System.out.println("Hitung Luas Segitiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai Alas  : "+Alas);
        System.out.println("Nilai Tinggi  : "+Tinggi);
        System.out.println("Nilai Luas  : ");
        System.out.println("Luas = Alas*Tinggi/2");
        System.out.println("    ="+Alas+"*"+Tinggi+"/2");
        System.out.println("    ="+Luas);
        
    }
}
