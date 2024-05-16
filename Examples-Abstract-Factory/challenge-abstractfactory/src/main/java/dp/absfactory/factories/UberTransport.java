package dp.absfactory.factories;

import dp.absfactory.aircrafts.Airplane;
import dp.absfactory.aircrafts.IAircraft;
import dp.absfactory.landvehicles.Car;
import dp.absfactory.landvehicles.ILandVehicle;


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
