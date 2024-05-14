package dp.factorymethod;

import dp.factorymethod.vehicles.Car;
import dp.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
