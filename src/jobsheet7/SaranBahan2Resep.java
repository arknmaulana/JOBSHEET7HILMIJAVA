/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

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
    }
}
