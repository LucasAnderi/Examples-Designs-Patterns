package dp.facmethod.vehicles;

public class Motorcycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting the delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked the package");
    }
}
