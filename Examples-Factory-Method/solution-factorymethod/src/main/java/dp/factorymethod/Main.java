package dp.factorymethod;
//challenge : implement this method but now with bikes , use "eats" in the configure method
public class Main {
    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }
    private static void runTransport(){
        transport.startTransport();
    }
    private static void configure(String type){
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            default:
                System.out.println("Seleciona o tipo de transporte");
        }
    }
}