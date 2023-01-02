package Driver;

import Transport.Competing;
import Transport.Transport;

public class DriverB<T extends Transport & Competing> extends Driver {

    public DriverB() {
        super("", true, 0);
    }

    public DriverB(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience);
    }


    public void drive(T transport) {
        System.out.println("Водитель " + getFullName() + " может управлять транспортным средством " + transport.getBrand() + " " +
                transport.getModel() + " и учавствовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Водители категории 'B' могуть стартовать");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водители с другой категорией остановитесь");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водители категории 'B' заправляют автомобиль");
    }
}