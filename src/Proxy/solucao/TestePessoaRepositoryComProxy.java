package Proxy.solucao;

import Proxy.PessoaService;
import builder.Pessoa;

public class TestePessoaRepositoryComProxy {



    public static void main(String[] args) {

        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();

        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        
        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);


        Pessoa pessoa = new Pessoa.pessoaBuilder()
                .sobrenome("Farias")
                .Nome("Raudiney")
                .apelido("Diney")
                .documento("321654")
                .build();
        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findByld(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pessoaService.findByld(1L);
        System.out.println(pessoaRetornadaCache);

    }
}
