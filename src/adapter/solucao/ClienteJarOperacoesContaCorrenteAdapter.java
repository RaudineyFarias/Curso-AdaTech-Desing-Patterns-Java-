package adapter.solucao;

import adapter.problema.JarOperacoesContaCorrente;
import java.math.BigDecimal;
import adapter.problema.JarOperacoesContaCorrente;


public class ClienteJarOperacoesContaCorrenteAdapter {



    private JarOperacoesContaCorrenteAdapter JarContaAdapter;


    public ClienteJarOperacoesContaCorrenteAdapter (JarOperacoesContaCorrenteAdapter JarContaAdapter) {

        this.JarContaAdapter = JarContaAdapter;
    }


    public void saca(BigDecimal valorPretendido){

        JarContaAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor){

        JarContaAdapter.deposita(valor);
    }
}
