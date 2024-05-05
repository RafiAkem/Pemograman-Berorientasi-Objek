public class Car extends Vehicle {
    private String model;

    public Car(String model, String brand, String color) {
        super(brand, color);
        setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}