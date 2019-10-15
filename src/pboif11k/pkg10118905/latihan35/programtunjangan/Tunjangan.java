/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan35.programtunjangan;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Tunjangan
 */
public class Tunjangan {
    private double gajiPokok;
    private String status;
    private boolean statusMenikah;
    private double totalGaji;
    private double tunjangan;
    
    private void cekStatus(String parStatus){
        if(parStatus.toUpperCase().equals("MENIKAH"))
            statusMenikah = true;
        else
            statusMenikah = false;
    }
    private void haslTunjangan(boolean parStatus, double parGajiPokok){
        if(parStatus){
            tunjangan = parGajiPokok * 0.35;
            totalGaji = parGajiPokok + tunjangan;
        }else {
            tunjangan = 0;
            totalGaji = parGajiPokok + tunjangan;
        }
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji pokok\t\t: Rp. "+gajiPokok);
        System.out.println("Tunjangan\t\t: Rp. "+tunjangan);
        System.out.println("Total Gaji\t\t: Rp. "+totalGaji);
        System.out.println("(Developed by : Anindira Dina Fitriani)");
        
    }
    
    public void pengecekanKaryawan(String parStatus, double parGajiPokok){
        gajiPokok = parGajiPokok;
        status = parStatus;
        cekStatus(status);
        hasilTunjangan(statusMenikah, gajiPokok);
    }
}
