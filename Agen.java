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
class Agen {
    
    private int AgendaCliID, AgendaPetID;
    private String AgendaDia, AgendaHora, Servico, CliNome, PetNome;
    
    public Agen( String AgendaDia, String AgendaHora, String CliNome, String PetNome, String Servico){
        this.CliNome = CliNome;
        this.PetNome = PetNome;
        this.AgendaDia = AgendaDia;
        this.AgendaHora = AgendaHora;
        this.Servico = Servico;
    }
    
    public String getCliNome(){
        return CliNome;
    }
    
    public String getPetNome(){
        return PetNome;
    }
    
    public String getAgendaDia(){
        return AgendaDia;
    }
    
    public String getAgendaHora(){
        return AgendaHora;
    }
    
    public String getServico(){
        return Servico;
    }
}
