package dp.is.vehicles;

public class Car implements IVehicle{
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Criando um carro :"+ " "+engine +" "+color+ " "+ year+ " " +seats);
        startVehicle();
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {

    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        // problem: this method will be empty
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando motores!");
    }
}
