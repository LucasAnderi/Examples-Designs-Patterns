package dp.isp;

import dp.isp.vehicles.Car;
import dp.isp.vehicles.Motorcycle;
// to solve the problem just segregate the interface in 2 more interfaces to separate the methods.
// so now, dont have any empty methods, creating a car or motorcycle.
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