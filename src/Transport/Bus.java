package Transport;

public class Bus extends Transport implements Competing{
private Capacity capacity;
    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Transport.Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Transport.Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Данные автобуса:\nБренд: " + getBrand() + " Модель: " + getModel() + " Объем двигателя: " + getEngineVolume();
    }

    @Override
    public void printType() {
        if (Capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {

            System.out.println("Вместимость авто: от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }
}