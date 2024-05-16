package dp.afactory.factories;

import dp.afactory.aircrafts.Airplane;
import dp.afactory.aircrafts.IAircraft;
import dp.afactory.landvehicles.Car;
import dp.afactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
