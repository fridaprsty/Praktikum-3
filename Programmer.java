/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pegawai;

/**
 *
 * @author Farida Prasetyaning
 */
public class Programmer extends pegawai{
    double bonus;

public void cetakInfo(){
    super.cetakInfo();
    
    System.out.println("Bonus :" + this.bonus);
}

public void setBonus(double Bonus){
    this.bonus = Bonus;
    
}

public double getBonus(){
    return this.bonus;
}

public void cetakBonus(){
    System.out.println("Bonus :" + this.bonus);
}
}
