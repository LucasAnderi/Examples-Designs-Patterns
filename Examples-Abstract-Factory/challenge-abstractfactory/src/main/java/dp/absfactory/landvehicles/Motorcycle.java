package dp.absfactory.landvehicles;

import dp.absfactory.landvehicles.ILandVehicle;

public class Motorcycle implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked up the package ");
    }
}
