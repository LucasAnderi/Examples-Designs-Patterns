package dp.afactory.landvehicles;

import dp.afactory.landvehicles.ILandVehicle;

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
