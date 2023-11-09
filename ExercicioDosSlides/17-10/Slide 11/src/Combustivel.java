public class Combustivel {
    private String nome;

    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double abastecerLitros(double qtdeLitros){
        double valorDinheiro = qtdeLitros*this.preco;
        return valorDinheiro;
    }

    public double abastecerDinheiro(double qtdeDinheiro){
        double qtdeLitros = qtdeDinheiro/this.preco;
        return qtdeLitros;
    }
}

