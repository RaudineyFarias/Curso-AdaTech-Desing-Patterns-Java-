package prototype;

public class Botao {

    protected String cor;
    protected int altura;
    protected int largura;
    protected TipoBordaEnum tipoBorda;




    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public TipoBordaEnum getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(TipoBordaEnum tipoDaBorda) {
        this.tipoBorda = tipoBorda;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", tipoBorda=" + tipoBorda +
                '}';
    }
}
