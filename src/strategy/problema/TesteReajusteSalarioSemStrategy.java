package strategy.problema;

import strategy.Funcionario;
import strategy.TipoDeContratacaoEnum;

import java.math.BigDecimal;

public class TesteReajusteSalarioSemStrategy {
    public static void main(String[] args) {

        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoDeContratacao(TipoDeContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Podolski");
        funcionarioPJ.setTipoDeContratacao(TipoDeContratacaoEnum.CLT);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioESTAGIO = new Funcionario();
        funcionarioESTAGIO.setNome("Osvaldo");
        funcionarioESTAGIO.setTipoDeContratacao(TipoDeContratacaoEnum.CLT);
        funcionarioESTAGIO.setSalario(new BigDecimal(2000));


        //Calcular os nossos reajustes aqui

        reajusteAnualSalario.calculoReajusteAnual(funcionarioCLT);
        reajusteAnualSalario.calculoReajusteAnual(funcionarioPJ);
        reajusteAnualSalario.calculoReajusteAnual(funcionarioESTAGIO);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioESTAGIO);

    }
}
