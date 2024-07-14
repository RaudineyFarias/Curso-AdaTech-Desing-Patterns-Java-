package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(40);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);

    }
}