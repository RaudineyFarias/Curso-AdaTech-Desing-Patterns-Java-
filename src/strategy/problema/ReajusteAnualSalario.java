package strategy.problema;

import strategy.Funcionario;
import strategy.TipoDeContratacaoEnum;

import java.math.BigDecimal;
import java.util.Timer;

public class ReajusteAnualSalario {

    public void calculoReajusteAnual (Funcionario funcionario){

        if (TipoDeContratacaoEnum.CLT.name().equals(funcionario.getTipoDeContratacao().name())){

            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal("0.10"))));

        }else if (TipoDeContratacaoEnum.PJ.name().equals(funcionario.getTipoDeContratacao())){

            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal("0.05"))));

        }else if(TipoDeContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoDeContratacao())){

            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal("0.02"))));}

    }


}
