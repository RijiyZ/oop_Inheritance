package Transport;

public class Truck extends Transport{
    private Weight weight;
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Transport.Weight getWeight() {
        return weight;
    }

    public void setWeight(Transport.Weight weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Данные грузового автомобиля:\nБренд: " + getBrand() + " Модель: " + getModel() + " Объем двигателя: " + getEngineVolume();
    }

    @Override
    public void printType() {
        if (Weight == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom()==null?"":"от " + weight.getFrom() + " ";
            String to = weight.getTo()==null?"":"до " + weight.getTo();
            System.out.println("Грузоподъемность авто: от " + from + to);
        }
    }
}