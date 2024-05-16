package dp.absfactory.app;

import dp.absfactory.aircrafts.IAircraft;
import dp.absfactory.factories.ITransportFactory;
import dp.absfactory.factories.IWaterTransport;
import dp.absfactory.landvehicles.ILandVehicle;
import dp.absfactory.watervehicles.IWatervehicle;


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
