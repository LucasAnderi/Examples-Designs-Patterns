package dp.is;

import dp.is.vehicles.Car;
import dp.is.vehicles.Motorcycle;

public class Main {
    private static String type; // could use enum
    public static void main(String[] args) {
        type = "Car";

        if(type == "Car"){
            Car car = new Car("Azul","2024",2.6,4);
        }else {
            Motorcycle motorcycle = new Motorcycle("Vermelho","2023",1000);
        }

    }
}