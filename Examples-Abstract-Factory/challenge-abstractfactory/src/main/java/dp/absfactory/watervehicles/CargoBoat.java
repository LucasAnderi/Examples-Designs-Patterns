package dp.absfactory.watervehicles;

public class CargoBoat implements IWatervehicle {
    @Override
    public void startRoute() {
        getCargo();
        sailCondition();
        System.out.println("Starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked up the cargo");
    }

    @Override
    public void sailCondition() {
        System.out.println("No storms, condition ok");
    }
}
