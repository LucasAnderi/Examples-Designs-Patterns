package dp.ocp.vehicles;

public class Car implements IVehicleCar {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine,int seats){
        configureVehicle(color, year,engine,seats);
    }


    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {

        this.color = color;
        this.year = year;
        this.engine=engine;
        this.seats= seats;

        System.out.println("Criando um carro com interface :"+color+" "+ engine+ " "+seats );
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando motores com interface");
    }
}
