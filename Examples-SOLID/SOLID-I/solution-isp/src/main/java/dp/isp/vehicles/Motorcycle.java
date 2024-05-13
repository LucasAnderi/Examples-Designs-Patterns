package dp.isp.vehicles;

public class Motorcycle implements IVehicles,IVehicleMotorcycle{
    private String color;
    private String year;
    private double engine;


    public Motorcycle(String color, String year, double engine){
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Criando uma moto :"+ " "+engine +" "+color+ " "+ year);
        startVehicle();
    }



    @Override
    public void configureMotorcycle(String color, String year, double engine) {

    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando motores");
    }
}
