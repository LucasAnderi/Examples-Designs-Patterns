package dp.ocp;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR){
            Vehicle vehicle = new Vehicle("Amarelo", "2021", 2.0, 4);
        }else if (typeVehicle == TypeVehicle.MOTORCYCLE){
            Vehicle vehicle = new Vehicle("","2022",250,1);
            vehicle.motorcycle();
        }
    }
}