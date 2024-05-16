package dp.absfactory.app;

import dp.absfactory.factories.IWaterTransport;
import dp.absfactory.watervehicles.IWatervehicle;

public class WaterApplication {

    private IWatervehicle watervehicle;
    public WaterApplication(IWaterTransport factory){
        watervehicle = factory.createWaterVehicle();
    }
    public void startRoute(){
        watervehicle.startRoute();
    }
}
