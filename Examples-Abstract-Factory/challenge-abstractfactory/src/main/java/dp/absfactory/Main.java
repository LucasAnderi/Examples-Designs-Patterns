package dp.absfactory;

import dp.absfactory.app.Application;
import dp.absfactory.app.WaterApplication;
import dp.absfactory.factories.*;

//the challenge is implement now , same as the example an enterprise that uses boats for delivery
public class Main {


    public static WaterApplication configureWaterApplication(){
        WaterApplication appwater;
        IWaterTransport wfactory;

        String company = "boats";

        if (company == "boats") {
            wfactory = new BoatsTransport();
            appwater = new WaterApplication(wfactory);
            return appwater;
        }else{
            return null;
        }
    }

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;
        String company = "uber"; //could use enum

        if(company == "uber"){
            factory=new UberTransport();
            app = new Application(factory);

        }else{
            factory = new NineNineTransport();
            app = new Application(factory);

        }
        return app;


    }

    public static void main(String[] args) {
//      Application app = configureApplication();
        WaterApplication wapp= configureWaterApplication();
        wapp.startRoute();
//      app.startRoute();
    }
}