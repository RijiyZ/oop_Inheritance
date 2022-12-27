package Transport;

public class Truck extends Transport{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }



    public String toString() {
        return "Данные грузового автомобиля:\nБренд: " + getBrand() + " Модель: " + getModel() + " Объем двигателя: " + getEngineVolume();
    }
}