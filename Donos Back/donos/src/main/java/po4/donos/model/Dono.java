package po4.donos.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dono {
    
    private UUID id;
    private String nome;
    private String telefone;
    private String email;
    private String rg;

    public Dono(@JsonProperty("id") UUID id,
                @JsonProperty("nome") String nome,
                @JsonProperty("telefone") String telefone,
                @JsonProperty("email") String email,
                @JsonProperty("rg") String rg) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

}
