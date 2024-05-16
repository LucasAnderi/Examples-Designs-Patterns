package dp.afactory.factories;


import dp.afactory.aircrafts.Helicopter;
import dp.afactory.aircrafts.IAircraft;
import dp.afactory.landvehicles.ILandVehicle;
import dp.afactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
