package solucao;

import builder.Pessoa;

import java.time.LocalDate;

public class pessoaBuilder {
    private String Nome;
    private String sobrenome;
    private String documento;
    private String email;
    private LocalDate dataNascimento;
    private String apelido;

    public pessoaBuilder Nome(String nome) {
        Nome = nome;
        return this;
    }

    public pessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public pessoaBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public pessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public pessoaBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public pessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }



    public Pessoa build(){
       return new Pessoa(Nome, sobrenome,documento, email, dataNascimento,apelido );
   }
}
// @Data =  Gertter And Setter
//@AllArgsConstructor = constructor
//NOArgsConstructor = Constructor Padrão
//Builder = Builder
