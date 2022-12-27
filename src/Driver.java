import Transport.*;

import java.time.LocalDate;
import java.util.Objects;

public class Driver<T extends Transport> {
    private String name;
    private String driveLicense;
    int experience;
    private final int yearDriveLicense;

    public Driver(String name, String driveLicense, int experience) {
        if (name == null || name.isBlank()) {
            name = "Фамилия Имя Отчество";
        }
        this.name = name;

        if (driveLicense == null || driveLicense.isBlank()) {
            driveLicense = "Категорию прав не имеет";
        }
        this.driveLicense = driveLicense;

        if (experience <= 0) {
            experience = 1;
        }
        this.experience = experience;
        this.yearDriveLicense = LocalDate.now().getYear() - experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getExperience() {
        experience = LocalDate.now().getYear() - yearDriveLicense;
        return experience;
    }

    public int getYearDriveLicense() {
        return yearDriveLicense;
    }

    public void startMoving() {
        System.out.println("Водитель " + name +" начинает движение");
    }

    public void stopMoving() {
        System.out.println("Водитель " + name +" останавливается");
    }

    public void refuelCar() {
        System.out.println("Водитель " + name +" заправляется");
    }

    public void driveTransport(T transport) {
        if (driveLicense == "B") {
            System.out.println("Водитель " + name + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        } else if (driveLicense == "C") {
            System.out.println("Водитель " + name + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        } else if (driveLicense == "D") {
            System.out.println("Водитель " + name + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        } else {
            System.out.println("Водитель " + name + " не может управлять данным авто");
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driveLicense='" + driveLicense + '\'' +
                ", experience=" + experience +
                ", yearDriveLicense=" + yearDriveLicense +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && yearDriveLicense == driver.yearDriveLicense && Objects.equals(name, driver.name) && Objects.equals(driveLicense, driver.driveLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driveLicense, experience, yearDriveLicense);
    }
}