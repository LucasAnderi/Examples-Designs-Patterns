package dp.facmethod;

import dp.facmethod.vehicles.IVehicle;
import dp.facmethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
