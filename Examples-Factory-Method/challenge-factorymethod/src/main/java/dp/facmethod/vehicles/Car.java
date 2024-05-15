package dp.facmethod.vehicles;

public class Car implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("I picked up the passengers, starting the route!");
    }
}
