public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1,1);

        r1.setLength(2);
        r1.setWidth(19);

        r1.calcularArea(r1.length,r1.width);
        r1.calcularPerimetro(r1.length);
    }
}