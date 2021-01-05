import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();
        Arrays.stream(
                AnimalEnum.values()).forEach(
                type-> System.out.println("Il verso e' "+ factory.getAnimal(type).getCall()));
    }
}