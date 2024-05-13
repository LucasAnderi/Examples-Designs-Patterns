package dp.ocp;

import dp.ocp.vehicles.Car;
import dp.ocp.vehicles.Motorcycle;
//open to extension closed to modification
public class Main {
    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {
        typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle == TypeVehicle.CAR) {
            Car car = new Car("Azul", "2022", 2.6, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("Vermelho", "2022", 300);
        }

    }
}