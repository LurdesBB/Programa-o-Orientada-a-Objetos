public class Carro {
    private String marca;
    private String modelo;

    public String calcularMarcha(int velocidade){
        if (velocidade == 0){
            return "Neutro";
        } else if (velocidade < 20){
            return "Primeira Marcha";
        } else if (velocidade < 40){
            return "Segunda Marcha";
        } else if (velocidade < 60){
            return "Terceira Marcha";
        } else {
            return "Quarta Marcha";
        }
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
