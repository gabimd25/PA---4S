/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author rafae
 */
class Forn {
    private int ForID;
    private String ForNome, ForTel, Foremail;
    
    public Forn(int ForID, String ForNome, String ForTel, String Foremail){
        this.ForID = ForID;
        this.ForNome = ForNome;
        this.ForTel = ForTel;
        this.Foremail = Foremail;
    }
    
    public int getForID(){
        return ForID;
    }
    
    public String getForNome(){
        return ForNome;
    }
    
    public String getForTel(){
        return ForTel;
    }
    
    public String getForemail(){
        return Foremail;
    }
}
