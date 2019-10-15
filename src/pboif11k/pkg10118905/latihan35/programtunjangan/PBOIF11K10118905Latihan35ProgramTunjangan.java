/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan35.programtunjangan;
import java.util.*;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Tunjangan
 */
public class PBOIF11K10118905Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gaji;
        String status;
        Scanner input = new Scanner (System.in);
        Tunjangan t = new Tunjangan();
        System.out.println("========Program Tunjangan========");
        System.out.println("Berapa gaji pokok anda perbulan\t: Rp. ");
        gaji = input.nextDouble();
        System.out.println("Status Anda (Menikah/Belum)\t: Rp. ");
        status = input.next();
        t.pengecekanKaryawan(status, gaji);
        
    }
        
    
}
