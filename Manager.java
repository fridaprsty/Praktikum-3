package pegawai;


import pegawai.pegawai;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Farida Prasetyaning
 */
public class Manager extends pegawai {
    double Tunjangan;
    
   
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan :" + this.Tunjangan);

    }
    
    public void setTunjangan( double Tunjangan){
        this.Tunjangan = Tunjangan;
        
    }
    
    public double getTunjangan(){
        return this.Tunjangan;
    
}
     public void cetakTunjangan(){
          System.out.println("Tunjangan :" + this.Tunjangan);
        }
}




