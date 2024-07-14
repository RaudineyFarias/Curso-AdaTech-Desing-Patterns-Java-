package FactoryMethods.solucao;

import FactoryMethods.produto;
import FactoryMethods.tipoprodutoEnum;
import FactoryMethods.produtoFisico;
import FactoryMethods.produtoDigital;


public class produtoFactory {

        public static  produto getInstance(tipoprodutoEnum tipoProdutoEnum){

            switch (tipoProdutoEnum){
                case FISICO:
                    produtoFisico produtoFIsico = new produtoFisico();
                    produtoFIsico.setPossuiDimensoes(true);
                    return produtoFIsico;
                case DIGITAL:
                    produtoDigital produtoDigital = new produtoDigital();
                    produtoDigital.setPossuiDimensoes(false );
                    return produtoDigital;
                default:
                    throw new IllegalArgumentException("Tipo de produto não disponível");
            }

        }
}
