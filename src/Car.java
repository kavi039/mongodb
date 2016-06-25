import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Created by kavita on 25/6/16.
 */
public class Car {
    Engine engine;
    Wheel wheel;

    public static void main(String[] args) {
        SimpleWheel object = ReflectionUtil.get("car.simple.wheel");
        System.out.println( object);

    }

}
