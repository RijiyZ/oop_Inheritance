package Transport;

public class Car extends Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Данные легкового автомобиля:\nБренд: " + getBrand() + " Модель: " + getModel() + " Объем двигателя: " + getEngineVolume();
    }
}
