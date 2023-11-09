import java.util.Scanner;
public class sla2 {
    public static void main(String[] args){
        int a;
        float b;
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inteiro:");
        a = sc.nextInt();
        System.out.println("Float");
        b = sc.nextFloat();
        System.out.println("String");
        c = sc.next();
        System.out.println("Mostrando inputs:");
        System.out.println("\tInteiro: " + a);
        System.out.println("\tFloat: " + b);
        System.out.println("\tString: " + c);
    }
}
