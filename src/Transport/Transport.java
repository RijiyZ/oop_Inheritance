package Transport;
public abstract class Transport implements Competing {
    private final String brand;
    private final String model;

    private double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            brand = "default";
        }
        if (model == null || model.isBlank()) {
            model = "default";
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void startMoving() {
        System.out.println(getBrand() +" " + getModel() + " начинает движение");
    }

    public void endMoving() {
        System.out.println(getBrand() +" " + getModel() + " заканчивает движение");
    }

    @Override
    public void pitStop(boolean pitStop) {
        if (pitStop) {
            System.out.println(getBrand() + " " + getModel() +" осуществил пит-стоп.");
        } else {
            System.out.println(getBrand() + " " + getModel() +" не осуществлял пит-стоп.");
        }
    }

    @Override
    public void bestLapTime(double minutes) {
        System.out.println("Лучшее время круга " + minutes + " минут.");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость " + speed + " км/ч.");
    }

    @Override
    public String toString() {
        return "Марка " + brand + " Модель " + model + " Мощность двигателя " + engineVolume;
    }
}