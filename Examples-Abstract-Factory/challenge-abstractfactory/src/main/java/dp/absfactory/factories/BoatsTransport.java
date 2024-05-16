package dp.absfactory.factories;

import dp.absfactory.watervehicles.CargoBoat;
import dp.absfactory.watervehicles.IWatervehicle;

public class BoatsTransport implements IWaterTransport {


    @Override
    public IWatervehicle createWaterVehicle() {
        return new CargoBoat();
    }
}
