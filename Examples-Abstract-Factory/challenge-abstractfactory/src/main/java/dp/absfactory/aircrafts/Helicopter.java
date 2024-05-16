package dp.absfactory.aircrafts;

public class Helicopter implements IAircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Starting flight");
    }

    @Override
    public void getCargo() {
        System.out.println("Passengers in , authorized flight");
    }

    @Override
    public void wind() {
        System.out.println("wind at 25km/h,southwest, condition ok");
    }
}
