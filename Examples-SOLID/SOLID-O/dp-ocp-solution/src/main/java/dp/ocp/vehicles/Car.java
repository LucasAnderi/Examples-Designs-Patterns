package dp.ocp.vehicles;

public class Car extends Vehicle {
    private int seats;

    public Car(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats= seats;

        configureCar();
    }
    public void configureCar(){
        System.out.println("Criando uma moto: "+color+" "+year+" "+engine+" "+seats);
    }
}
