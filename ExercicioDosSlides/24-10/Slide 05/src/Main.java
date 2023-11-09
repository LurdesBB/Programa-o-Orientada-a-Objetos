import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("As cores:");

        for (TrafficLight cores : TrafficLight.values()) {
            System.out.printf("%-10s%-10s%s%n", cores, cores.getCor(), cores.getTempo());
        }
    }
}