package strategy;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;

    private BigDecimal salario;

    private TipoDeContratacaoEnum tipoDeContratacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoDeContratacaoEnum getTipoDeContratacao() {
        return tipoDeContratacao;
    }

    public void setTipoDeContratacao(TipoDeContratacaoEnum tipoDeContratacao) {
        this.tipoDeContratacao = tipoDeContratacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", tipoDeContratacao=" + tipoDeContratacao +
                '}';
    }
}
