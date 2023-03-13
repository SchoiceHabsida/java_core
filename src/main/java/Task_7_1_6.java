import java.util.Arrays;

public class Task_7_1_6 {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (java.lang.Exception e) {
        }
    }

    public static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("The car started driving.");
        }
        @Override
        public void close() {
            System.out.println("Shutting down the car...");
        }
    }
}
