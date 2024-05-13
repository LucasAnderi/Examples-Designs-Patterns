package dp.liskov;

public class NubankRewards implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //validation
        System.out.println("Limite ok, Rewards OK!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Pontuação creditada no programa Rewards");
    }
}
//to create a new card (the NubankRewards), doesn't need to change the class NubankCard, because we developed with the interface.
