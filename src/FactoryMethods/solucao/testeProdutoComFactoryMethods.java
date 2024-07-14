package FactoryMethods.solucao;


import FactoryMethods.produto;
import FactoryMethods.tipoprodutoEnum;

import java.util.Calendar;

public class testeProdutoComFactoryMethods {

    public static void main(String[] args) {

        produto produtoDigital = produtoFactory.getInstance(tipoprodutoEnum.DIGITAL);
        produto produtoFisico = produtoFactory.getInstance(tipoprodutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

        Calendar Calendario = Calendar.getInstance();


        System.out.println(Calendario);
    }
}
