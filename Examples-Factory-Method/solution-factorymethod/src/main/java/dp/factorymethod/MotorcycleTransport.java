package dp.factorymethod;

import dp.factorymethod.Transport;
import dp.factorymethod.vehicles.IVehicle;
import dp.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
