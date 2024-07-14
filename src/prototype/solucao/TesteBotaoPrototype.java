package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

    public static void main(String[] args) {
        //aqui onde fica registrado nossos botões

        Botao botaoVermelho = BotaoRegistry.getBotao("BOTÃO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTÃO_AZUL");
        System.out.println(botaoVermelho);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTÃO_AMARELO");
        System.out.println(botaoVermelho);

        String chave = "BOTAO_PRETO";
        Botao botaopreto = new Botao();
        botaopreto.setCor("Preto");
        botaopreto.setAltura(400);
        botaopreto.setLargura(1205);
        botaopreto.setTipoBorda(TipoBordaEnum.FINA);

        BotaoRegistry.addRegistry(chave, botaopreto);

        Botao botaoPretoClone= BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);

    }
}
