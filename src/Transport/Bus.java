package Transport;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }



    @Override
    public String toString() {
        return "Данные автобуса:\nБренд: " + getBrand() + " Модель: " + getModel() + " Объем двигателя: " + getEngineVolume();
    }
}