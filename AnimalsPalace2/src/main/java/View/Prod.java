/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Gabim
 */
public class Prod {
    
    private int ProID,ProQuant;
    private String ProNome,ForNome,ProDesc;
    private float ProPre;
    
    public Prod(int ProID,String ProNome, float ProPre, String ForNome,int ProQuant, String ProDesc){
        this.ProID = ProID;
        this.ProNome = ProNome;
        this.ProPre = ProPre;
        this.ForNome = ForNome;
        this.ProQuant = ProQuant;
        this.ProDesc = ProDesc;    
    }
    public int getProID(){
        return ProID;
    }
    public String getForNome(){
        return ForNome;
    }
    public int getProQuant(){
        return ProQuant;
    }    
    public String getProNome(){
        return ProNome;
    }
    public String getProDesc(){
        return ProDesc;
    }
    public float getProPre(){
        return ProPre;
    }
}
