/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;

import java.util.Scanner;

/**
 *
 * @author alfan
 */
public class percabanganswitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilih = "";
        do {
            double nilaiharian, nilaiuts, nilaiuas, nilaiakhir;
            System.out.println("Masukan nilai Harian");
            nilaiharian = input.nextDouble();
            System.out.println("Masukan nilai UTS");
            nilaiuts = input.nextDouble();
            System.out.println("Masukan Nilai UAS");
            nilaiuas = input.nextDouble();
            //nilai akhir adalah = 20% nilai harian + 30% nilai uts + 50%nilai uas
            nilaiakhir = nilaiharian * 0.2 + nilaiuts * 0.3 + nilaiuas * 0.5;
            String grade = "";
            if (nilaiakhir > 80) {
                grade = "A";
            } else if (nilaiakhir > 70) {
                grade = "B";
            } else if (nilaiakhir > 60) {
                grade = "C";
            } else if (nilaiakhir > 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Nilai harian = " + nilaiharian);
            System.out.println("Nilai uts = " + nilaiuts);
            System.out.println("Nilai uas = " + nilaiuas);
            System.out.println("Nilai akhir = " + nilaiakhir);
            System.out.println("Grade = " + grade);
            
            System.out.println("================");
            System.out.println("Apakah anda ingin mengulang y/t");
            pilih = input.next();
        } while (pilih.equals("y"));
        
    }
}
