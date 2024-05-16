package dp.absfactory.landvehicles;

public class Car implements ILandVehicle {
    @Override
    public void startRoute() {
       getCargo();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("I picked up the passengers!");
    }
}
