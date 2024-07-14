package adapter.solucao;

import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {


    private JarOperacoesContaCorrente JarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {

        JarConta = jarConta;
    }

    public void saca(BigDecimal valorPretendido){
        if (JarConta.validaSaldo((valorPretendido))){

            JarConta.saca(valorPretendido);

        }else {
            throw new IllegalArgumentException("Valor para saque não permitido");

        }

    }

    public void deposita(BigDecimal valor){
       JarConta.deposita(valor);
    }
}
