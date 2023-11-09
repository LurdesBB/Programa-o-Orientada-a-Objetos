public class Main {
    public static void main(String [] args){
        Carro carro = new Carro();

        carro.setMarca("Fiat");
        carro.setModelo("Mobi");

        String marcha = carro.calcularMarcha(25);

        System.out.println(marcha);
    }
}
