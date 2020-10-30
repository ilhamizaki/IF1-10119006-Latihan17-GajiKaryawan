/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menentukan Gaji Karyawan
 */
public class IF110119006Latihan17GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner (input)
        Scanner userInput = new Scanner(System.in);
        //variabel
        double gajiPokok, tunjangan, totalGaji;
        String status;
        
        //Program Tunjangan
        System.out.println("===========Program Tunjangan============");
        System.out.print("Berapa Gaji Pokok anda perbulan ?: Rp. ");
        gajiPokok = userInput.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        status = userInput.next();
        
        //Proses aritmatika
        if ("Menikah".equals(status)) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        
        totalGaji = tunjangan + gajiPokok;
        
        System.out.println();
        //Hasil Perhitungan Gaji
        System.out.println("======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok \t: Rp " + gajiPokok);
        System.out.println("Tunjangan \t: Rp " + tunjangan);
        System.out.println("Total Gaji \t: Rp " + totalGaji);
        System.out.println("(Developed by : Ilham Zaki)");

    }
}
