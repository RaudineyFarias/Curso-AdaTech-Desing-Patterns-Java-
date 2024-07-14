package FactoryMethods.problema;


import FactoryMethods.produtoFisico;
import FactoryMethods.produtoDigital;

public class testeProduto {
    public static void main(String[] args) {
        produtoFisico produtoFisico = new produtoFisico();
        produtoFisico.setPossuiDimensoes(true);

        produtoDigital produtoDigital = new produtoDigital();
        produtoDigital.setPossuiDimensoes(false);
    }

}
