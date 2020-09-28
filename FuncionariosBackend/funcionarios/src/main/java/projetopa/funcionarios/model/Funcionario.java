package projetopa.funcionarios.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Funcionario {
    
    private UUID id;
    private String nome;
    private String telefone;
    private String rg;
    private String endereço;
    private String carteira_de_trabalho;
    private String funçao;

    public Funcionario(@JsonProperty("id") UUID id,
                @JsonProperty("nome") String nome,
                @JsonProperty("telefone") String telefone,
                @JsonProperty("rg") String rg,
                @JsonProperty("endereço") String endereço,
                @JsonProperty("carteira_de_trabalho") String carteira_de_trabalho,
                @JsonProperty("funçao") String funçao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.endereço = endereço;
        this.carteira_de_trabalho = carteira_de_trabalho;
        this.funçao = funçao;
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

    public String getRg() {
        return rg;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCarteira_de_trabalho() {
        return carteira_de_trabalho;
    }
    
    public String getFunçao() {
        return funçao;
    }
}
