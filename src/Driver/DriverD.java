package Driver;

import Transport.Competing;
import Transport.Transport;

public class DriverD<T extends Transport & Competing> extends Driver {

    public DriverD() {
        super("", true, 0);
    }
    public DriverD(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void drive(T transport) {
        System.out.println("Водитель " + getFullName() + " может управлять транспортным средством " + transport.getBrand() + " " +
                transport.getModel() + " и учавствовать в заезде");
    }

    @Override
    public void startMoving() {
        System.out.println("Водители категории 'D' могуть стартовать");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водители с другой категорией остановитесь");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водители категории 'D' заправляют автомобиль");
    }
}