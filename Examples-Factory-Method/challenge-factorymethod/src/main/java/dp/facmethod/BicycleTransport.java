package dp.facmethod;

import dp.facmethod.vehicles.Bicycle;
import dp.facmethod.vehicles.IVehicle;

public class BicycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
