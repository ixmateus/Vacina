package br.com.vacinacao.vacinacao.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CadastroUsuario(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String CPF,
        @NotBlank
        String DataNascimento
) {
}
