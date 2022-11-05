/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pegawai;

/**
 *
 * @author Farida Prasetyaning
 */
public class PegawaiBeraksi {
    public static void main(String[] args) {
        
        Manager roy = new Manager();
        roy.nama = "Roy Simanjuntak";
        roy.gajiPokok = 5000000;
        roy.Tunjangan = 2000000;
        
        roy.cetakInfo();
        
        
        Programmer sinta = new Programmer();
        sinta.nama = "Sinta Yulianti";
        sinta.gajiPokok = 5000000;
        sinta.bonus = 1000000;
        
        sinta.cetakInfo();
        
    }
    }


