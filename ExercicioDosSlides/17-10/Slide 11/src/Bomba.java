import java.util.ArrayList;

public class Bomba {
    private String identificador;

    private ArrayList<Combustivel> combustiveis;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Combustivel> getCombustiveis() {
        return combustiveis;
    }

    public void setCombustiveis(ArrayList<Combustivel> combustiveis) {
        this.combustiveis = combustiveis;
    }
}

