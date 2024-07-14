package adapter.solucao;

import adapter.problema.ClienteJarOperacoesContaCorrente;
import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
            ClienteJarOperacoesContaCorrenteAdapter cliente = new ClienteJarOperacoesContaCorrenteAdapter(jarContaAdapter);

            BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

            cliente.saca(valorPretendidoParaSaque);

            cliente.deposita(new BigDecimal(500));

    }


}
