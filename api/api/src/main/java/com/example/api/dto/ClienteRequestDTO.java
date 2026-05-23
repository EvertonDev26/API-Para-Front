package com.example.api.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "O nome não pode ser vazio.")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres.")
    private String nome;

    @Email(message = "O email deve pode ser válido.")
    private String email;

    @NotNull(message = "O telefone é obrigatório.")
    private String telefone;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public @NotBlank(message = "O nome não pode ser vazio.") @Size(min = 3, message = "O nome deve ter no monimo 3 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome não pode ser vazio.") @Size(min = 3, message = "O nome deve ter no monimo 3 caracteres") String nome) {
        this.nome = nome;
    }

    public @Email(message = "O email deve pode ser válido.") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "O email deve pode ser válido.") String email) {
        this.email = email;
    }

    public @NotNull(message = "O telefone é obrigatório.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotNull(message = "O telefone é obrigatório.") String telefone) {
        this.telefone = telefone;
    }
}