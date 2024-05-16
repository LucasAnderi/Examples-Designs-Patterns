package dp.afactory;

import dp.afactory.app.Application;
import dp.afactory.factories.ITransportFactory;
import dp.afactory.factories.NineNineTransport;
import dp.afactory.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "uber"; //could use enum

        if(company == "99"){
            factory=new UberTransport();
        }else{
            factory = new NineNineTransport();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}