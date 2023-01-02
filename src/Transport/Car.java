package Transport;


public class Car extends Transport implements Competing{
    private TypeOfBody typeOfBody;
    public Car(String brand,
               String model,
               double engineVolume,
               TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public Transport.TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(Transport.TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Данные легкового автомобиля:\nБренд: " + getBrand() + " Модель: " + getModel() + " Объем двигателя: " + getEngineVolume();
    }

    @Override
    public void printType() {
        if (TypeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова: " + TypeOfBody);
        }
    }
}
