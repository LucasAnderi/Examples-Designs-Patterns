package dp.factorymethod;

import dp.factorymethod.vehicles.IVehicle;

public abstract class Transport {
    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }
    protected abstract IVehicle createTransport();

}
