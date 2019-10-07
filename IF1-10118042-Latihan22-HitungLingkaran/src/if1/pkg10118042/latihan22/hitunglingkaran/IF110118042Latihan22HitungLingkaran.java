/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan22.hitunglingkaran;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Menghitung Lingkaran
 */

public class IF110118042Latihan22HitungLingkaran {


    public static void main(String[] args) {
      int diameter;
           int jari2;
           double luasLingkaran;
           double kelilingLingkaran;
           String validasi;
           boolean valid = true;
           
           
      
        do{
            //input
             System.out.print("Masukkan Nilai Diameter Lingkaran : ");
             Scanner temp = new Scanner(System.in);
             validasi = temp.nextLine();
        
            //logika dan output
            if (validasi.matches("[0-9]*")) {
                diameter = temp.nextInt();
                jari2 = diameter / 2;
                luasLingkaran = 3.14 * Math.pow(jari2, 2) ;
                kelilingLingkaran = 3.14 * diameter;
                System.out.println("===HASIL PERHITUNGAN===");
                System.out.println("Jari-Jari Lingkaran\t= " + jari2+"cm");
                System.out.printf("Luas Lingkaran\t\t= %.2f%n",luasLingkaran , "cm");
                System.out.printf("Keliling Lingkaran\t= %.2f%n",kelilingLingkaran , "cm");
                valid = false;
                break;
             } 
            else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println();
             }
        }while(valid = true);
              
        
       
       

       
        
        
       
        
        
    }
    
}
