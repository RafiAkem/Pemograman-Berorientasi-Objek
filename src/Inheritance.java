public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Type R", "Avanza", "Putih");
        System.out.println(car.getModel() +
                " - " + car.getBrand() +
                " - " + car.getColor());
    }
}