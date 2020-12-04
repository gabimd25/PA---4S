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
public class Pet {
    private int PetCliID, PetID, CliID;
    private String PetNome, PetEsp, Petraca, PetSexo, PetData, PetDoen, PetCast, CliNome;
    
    public Pet (int PetID, String PetNome, String PetEsp, String Petraca, String PetSexo, String CliNome, String PetDoen, String PetCast, String PetData){
        this.CliNome = CliNome;
        this.PetID = PetID;
        this.PetEsp = PetEsp;
        this.Petraca = Petraca;
        this.PetNome = PetNome;
        this.PetSexo = PetSexo;
        this.PetDoen = PetDoen;
        this.PetCast = PetCast;
        this.PetData = PetData;
    }
    
    public int getPetID(){
        return PetID;
    }
    
    public String getCliNome(){
        return CliNome;
    }
    
    public String getPetEsp(){
        return PetEsp;
    }
    
    public String getPetraca(){
        return Petraca;
    }
    
    public String getPetNome(){
        return PetNome;
    }
    
    public String getPetSexo(){
        return PetSexo;
    }
    
    public String getPetDoen(){
        return PetDoen;
    }
    
    public String getPetCast(){
        return PetCast;
    }
    
    public String getPetData(){
        return PetData;
    }
}
