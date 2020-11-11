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
class Func {
    public int FunID;
    private String FunNome, FunTel, FunRG, FunEnd, FunCT, FunFun;
    
    public Func(int FunID, String FunNome, String FunTel, String FunRG, String FunEnd, String FunCT, String FunFun){
        this.FunID = FunID;
        this.FunNome = FunNome;
        this.FunTel = FunTel;
        this.FunRG = FunRG;
        this.FunEnd = FunEnd;
        this.FunCT = FunCT;
        this.FunFun = FunFun;
    }
    
    public int getFunID(){
        return FunID;
    }
    
    public String getFunNome(){
        return FunNome;
    }
    
    public String getFunTel(){
        return FunTel;
    }
    
    public String getFunRG(){
        return FunRG;
    }
    
    public String getFunEnd(){
        return FunEnd;
    }
    
    public String getFunCT(){
        return FunCT;
    }
    
    public String getFunFun(){
        return FunFun;
    }
}
