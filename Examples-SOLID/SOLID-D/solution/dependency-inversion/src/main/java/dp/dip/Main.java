package dp.dip;

import dp.dip.payment.Payment;
//problem here is the high lvl class have dependancy of low lvl class
public class Main {
    public static void main(String[] args) {
        Payment payment= new Payment();
        payment.pay("250");
    }
}