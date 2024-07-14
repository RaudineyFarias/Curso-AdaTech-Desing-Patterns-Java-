package FactoryMethods;

import jdk.jfr.DataAmount;

import java.math.BigDecimal;


public class produto {

    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimensoesFisicas;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getPossuiDimensoes() {
        return possuiDimensoesFisicas;
    }

    public void setPossuiDimensoes(Boolean possuiDimensoes) {
        this.possuiDimensoesFisicas = possuiDimensoes;
    }

    @Override
    public String toString() {
        return "produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", possuiDimensoesFisicas=" + possuiDimensoesFisicas +
                '}';
    }
}
