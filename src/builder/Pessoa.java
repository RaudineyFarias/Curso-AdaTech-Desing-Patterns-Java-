package builder;


import java.time.LocalDate;

public class Pessoa {

    private String Nome;
    private String sobrenome;
    private String documento;
    private String email;
    private LocalDate dataNascimento;
    private String apelido;

    public Pessoa(String nome, String sobrenome, String documento, String email, LocalDate dataNascimento, String apelido) {
        Nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.apelido = apelido;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "Nome='" + Nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", apelido='" + apelido + '\'' +
                '}';
    }
    public static class pessoaBuilder {
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

}

// @Data =  Gertter And Setter
//@AllArgsConstructor = constructor
//NOArgsConstructor = Constructor Padrão
//Builder = Builder
