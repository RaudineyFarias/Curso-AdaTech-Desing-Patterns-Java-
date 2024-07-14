package adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClienteJarOperacoesContaCorrente cliente = new ClienteJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);


        if (cliente.validaSaldo(valorPretendidoParaSaque)){
            cliente.saca(valorPretendidoParaSaque);
        }

        cliente.deposita(new BigDecimal(500));
    }
}
