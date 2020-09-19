package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {
    private String licensePlate;
    private String brand;
    private String subtype;
    int kmStatus;

    CarOwner carOwner;

    public Car(String licensePlate, String brand, String subtype, int kmStatus) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.subtype = subtype;
        this.kmStatus = kmStatus;
    }

    public void setCarOwner(CarOwner carOwner) {
        if (carOwner != null) {
            this.carOwner = carOwner;
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getSubtype() {
        return subtype;
    }

    public int getKmStatus() {
        return kmStatus;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }
}
