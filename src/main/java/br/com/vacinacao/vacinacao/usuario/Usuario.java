package br.com.vacinacao.vacinacao.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private String email;
    private String CPF;
    private String DataNascimento;

   public Usuario (CadastroUsuario cadastroUsuario) {
       this.nome = cadastroUsuario.nome();
       this.email = cadastroUsuario.email();
       this.CPF = cadastroUsuario.CPF();
       this.DataNascimento = cadastroUsuario.DataNascimento();
   }

}