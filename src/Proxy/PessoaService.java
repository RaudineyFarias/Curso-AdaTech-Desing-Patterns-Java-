package Proxy;

import Proxy.solucao.PessoaProxy;
import Proxy.solucao.PessoaRepositoryProxy;
import builder.Pessoa;


public class PessoaService {

    private PessoaRepositoryProxy PessoaRepositoryProxy;

    private PessoaProxy pessoaProxy;

    public PessoaService(PessoaProxy pessoaProxy){

        this.pessoaProxy = pessoaProxy;

    }

    public void save (Pessoa pessoa){

        pessoaProxy.save(pessoa);

    }

    public Pessoa findByld(Long id){

        return pessoaProxy.findById(id);
    }
}
