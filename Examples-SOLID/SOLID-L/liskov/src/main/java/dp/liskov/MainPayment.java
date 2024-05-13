package dp.liskov;

public class MainPayment {

    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();
        NubankRewards card = new NubankRewards();

        card.validate();
        card.collectPayment();

    }
// if we need to create a new card, like the class NubankRewards using the Liskov principle ,
// i use interfaces so i don't need to change the NubankCard class and the code still work and became flexible to changes.
}
