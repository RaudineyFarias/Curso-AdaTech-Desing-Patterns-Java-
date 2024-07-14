package Proxy.solucao;

import builder.Pessoa;

public interface PessoaProxy {

    void save (Pessoa pessoa);

    Pessoa findById(long id);

}
