package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo(){
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
