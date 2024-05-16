package dp.absfactory.factories;

import dp.absfactory.aircrafts.IAircraft;
import dp.absfactory.landvehicles.ILandVehicle;
import dp.absfactory.watervehicles.IWatervehicle;


public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();

}
