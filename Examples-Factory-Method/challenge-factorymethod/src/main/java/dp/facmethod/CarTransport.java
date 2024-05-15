package dp.facmethod;

import dp.facmethod.vehicles.Car;
import dp.facmethod.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
