import product.circle.Circle;
import product.triangle.Triangle;
import factory.AbstractFactory;
import factory.FactoryProvider;
import factory.FactoryType;

public class Main {
    private static final Double RADIUS = 5.0;
    private static final Double AB = 3.0;
    private static final Double BC = 4.0;
    private static final Double CA = 5.0;

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.BLACK);
        client(factory);

        factory = FactoryProvider.getFactory(FactoryType.WHITE);
        client(factory);
    }

    public static void client(AbstractFactory factory){
        Circle circle = factory.createCircle(RADIUS);
        Triangle triangle = factory.createTriangle(AB, BC, CA);

        System.out.println("---------TRIANGLE------------");
        System.out.println(triangle);
        System.out.println("Triangle calculation method result = "+ triangle.calculate());

        System.out.println("---------CIRCLE------------");
        System.out.println(circle);
        System.out.println("Circle calculation method result = "+ circle.calculate()+"\n");
    }
}
