package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul(){
        setCor("Azul");
        setAltura(40);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }


}
