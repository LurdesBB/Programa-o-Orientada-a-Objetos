public class Rectangle {
    public float length;
    public float width;
    public float perimetro;
    public float area;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength(float length) {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth(float width) {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void calcularPerimetro(float length){
        if(width > 0.0 && width < 20.0){
            perimetro = length * 4;
            System.out.printf("\nO perimetro: "+perimetro);
        }else{
            System.out.println("Número inválido!");
        }
    }

    public void calcularArea(float length, float width){
        if(length > 0.0 && length < 20.0){
            area = length * width;
            System.out.printf("\nA area: "+area);
        }else{
            System.out.println("Número inválido!");
        }
    }
}
