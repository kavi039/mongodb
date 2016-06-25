/**
 * Created by kavita on 25/6/16.
 */
public class Bmw {
    public static void main(String[] args) {
        Wheel object1 = ReflectionUtil.get("car.simple.wheel");
        Engine object2 = ReflectionUtil.get("car.simple.engine");
        object1.setDuration(10);
        object2.setCanRun(24D);
        Car car = new Car(object2, object1);
            car.drive();

    }
}
