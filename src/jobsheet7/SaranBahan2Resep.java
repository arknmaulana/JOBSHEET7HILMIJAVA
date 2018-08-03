/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author HP ZBOOK 15
 */

public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "Maulana Hilmi Arkan / X RPL 5 / 21";
        System.out.println("Identitas : " + identitas);
        
        System.out.print("\nSaran Resep dari Bahan yang Anda Miliki\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda :");
        int bahanl = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.outprintln("1. Susu");
                System.outprintln("2. Minyak Goreng");
                System.outprintln("3. Tidak ada");
            }else{
                System.outprintln("1. Minyak Goreng");
                System.outprintln("2. Roti");
                System.outprintln("3. Tidak ada");
            }
            System.out.print("Masukkan no pilihan Anda :");
            int bahan2 = scanner.nextInt();
            
            
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
    }
}
