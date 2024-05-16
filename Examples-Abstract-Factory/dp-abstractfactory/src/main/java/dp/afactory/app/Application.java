package dp.afactory.app;

import dp.afactory.aircrafts.IAircraft;
import dp.afactory.factories.ITransportFactory;
import dp.afactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }
    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
