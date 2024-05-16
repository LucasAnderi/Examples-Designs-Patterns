package dp.absfactory.factories;


import dp.absfactory.aircrafts.Helicopter;
import dp.absfactory.aircrafts.IAircraft;
import dp.absfactory.landvehicles.ILandVehicle;
import dp.absfactory.landvehicles.Motorcycle;
import dp.absfactory.watervehicles.CargoBoat;
import dp.absfactory.watervehicles.IWatervehicle;


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
