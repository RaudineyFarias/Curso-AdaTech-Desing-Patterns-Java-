package builder.solucao;

import builder.Pessoa;

import java.time.LocalDate;

public class testePessoaBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new solucao.pessoaBuilder().Nome("Raudiney")
                .sobrenome("Farias")
                .documento("321654987")
                .email("Raudiney-@gmail.com")
                .dataNascimento(LocalDate.of(1955,12,23))
                .apelido("Diney")
                .build();

        System.out.println(pessoa);

    }
}
// @Data =  Gertter And Setter
//@AllArgsConstructor = constructor
//NOArgsConstructor = Constructor Padrão
//Builder = Builder