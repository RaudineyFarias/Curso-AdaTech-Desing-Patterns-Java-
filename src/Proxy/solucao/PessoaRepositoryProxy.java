package Proxy.solucao;

import Proxy.PessoaRepository;
import builder.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import static javax.swing.UIManager.get;

public class PessoaRepositoryProxy extends PessoaRepository implements PessoaProxy{


    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache= new HashMap<>();

    @Override
    public void save (Pessoa pessoa){
            log.info("Iniciando chamada do metodo save..");

        super.save(pessoa);
            log.info("Finalizando chamada do metodo save..");
    }


    public Pessoa findById(Long id ){
        log.info("Iniciando chamada do metodo findById..");
        long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;
        if (Objects.nonNull(cache.get(id))){
            log.info("Está pegando do cache..");
            pessoa = cache.get(id);
        }else {
            log.info("Está pegando do PessoaRepositoryProxy..");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }


        log.info("Finalizando chamada do metodo findById..");
        long fim = System.currentTimeMillis();
        log.info("tempo gasto na chamada..."+(fim - inicio));
        return pessoa;
    }

}
