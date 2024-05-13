package dp.dip.payment;

import dp.dip.model.MYSQLProduct;

public class Payment {
    public void pay(String productID){
        MYSQLProduct dbproduct=new MYSQLProduct();
        String product = dbproduct.getProductById(productID);
        System.out.println(product);
    }
}
