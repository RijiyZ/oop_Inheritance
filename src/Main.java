import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car daewoo = new Car("Daewoo", "nexia", 1.5);
        Car kia = new Car("Kia", "Sportage 4", 2.4);
        Car audi = new Car("Audi", "A8", 3.0);
        Car hyundai = new Car("Hyundai", "Avante", 1.6);

        Truck gaz = new Truck("Gaz", "El", 2.0);
        Truck jac = new Truck("Jac", "Sunray", 2.5);
        Truck man = new Truck("Man", "TGS", 2.2);
        Truck foton = new Truck("Foton", "Auman", 2.3);

        Bus citroen = new Bus("Citroen", "Jumper", 2.5);
        Bus mercedes = new Bus("Mercedes-Benz", "Sprinter", 2.8);
        Bus liaz = new Bus("Лиаз", "4292", 2.6);
        Bus volvo = new Bus("Volvo", "7900", 2.2);

        drive(audi, true,5.3, 250);
        drive(liaz, false,10.8, 180);

        Driver<Car, Truck, Bus> arkadiy = new Driver<Car, Truck, Bus>("Аркадий Цареградцев ", "B", 10);
        Driver<Car,Truck,Bus> ivan = new Driver<Car, Truck, Bus>("Дикарев Иван", "D", 1);
        arkadiy.driveTransport(daewoo);
        ivan.driveTransport(citroen);

    }

    public static void drive(Transport transport, boolean pitStop,double minutes, int speed) {
        transport.startMoving();
        transport.pitStop(pitStop);
        transport.bestLapTime(minutes);
        transport.maxSpeed(speed);
        transport.endMoving();
        System.out.println();
    }
}