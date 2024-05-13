package dp.is.vehicles;

// problem: if you create a car ,will have a empty method configureMotorcycle.
// same if i need to create a motorcycle
public interface IVehicle {

    public void configureCar(String color, String year, double engine, int seats);
    public void configureMotorcycle(String color, String year, double engine);
    public void startVehicle();

}
