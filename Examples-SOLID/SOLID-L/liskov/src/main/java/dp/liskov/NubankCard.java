package dp.liskov;

abstract public class NubankCard implements IPaymentInstrument {

    @Override
    public void validate() throws Exception{

    }
    @Override
    public void collectPayment(){
        System.out.println("Pagamento Realizado");
    }
}
