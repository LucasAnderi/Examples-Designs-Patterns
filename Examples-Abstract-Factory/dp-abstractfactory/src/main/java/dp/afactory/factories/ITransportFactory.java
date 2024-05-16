package dp.afactory.factories;

import dp.afactory.aircrafts.IAircraft;
import dp.afactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
