package dp.liskov;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();

}
