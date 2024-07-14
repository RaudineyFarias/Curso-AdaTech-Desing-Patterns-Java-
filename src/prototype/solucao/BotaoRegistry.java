package prototype.solucao;

import prototype.TipoBordaEnum;
import prototype.problema.BotaoAmarelo;
import prototype.Botao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {


    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho= new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(40);
        botaoVermelho.setLargura(125);
        botaoVermelho.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(40);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.FINA);

        REGISTRY.put("BOTÃO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTÃO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTÃO_AZUL", botaoAzul);
    }

    public static Botao getBotao (String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));

    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}
