/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rafae
 */
public class Cli {
    private int CliID, PetCliID;
    private String CliNome, CliTel, CliEmail, CliRG, PetNome;
    
    public Cli(int CliID, String CliNome, String CliTel, String CliEmail, String PetNome, String CliRG){
        this.CliID = CliID;
        this.CliNome = CliNome;
        this.CliTel = CliTel;
        this.CliEmail = CliEmail;
        this.PetNome = PetNome;
        this.CliRG = CliRG;
    }
    
    public int getCliID(){
        return CliID;
    }
    
    public String getCliNome(){
        return CliNome;
    }
    
    public String getCliTel(){
        return CliTel;
    }
    
    public String getCliEmail(){
        return CliEmail;
    }
    
    public String getPetNome(){
        return PetNome;
    }
    
    public String getCliRG(){
        return CliRG;
    }
}
