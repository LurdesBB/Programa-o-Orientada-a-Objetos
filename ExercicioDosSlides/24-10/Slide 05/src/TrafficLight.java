public enum TrafficLight {
    RED("vermelho","1"),
    GREEN("verde", "2"),
    YELLOW("amarelo", "3");

    private final String cor;
    private final String tempo;

    TrafficLight(String cor, String tempo) {
        this.cor = cor;
        this.tempo = tempo;
    }

    public String getCor() {
        return cor;
    }
    
    public String getTempo() {
        return tempo;
    }

}
