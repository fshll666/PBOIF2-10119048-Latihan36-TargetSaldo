/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan36.targetsaldo;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Target saldo tabungan
 */
public class PBOIF210119048Latihan36TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Target target = new Target();
        
        target.setSaldo(3500000);
        target.setSaldoTarget(6000000);
        target.setBunga(0.08);
        
        target.hitungTarget();
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
    
}
