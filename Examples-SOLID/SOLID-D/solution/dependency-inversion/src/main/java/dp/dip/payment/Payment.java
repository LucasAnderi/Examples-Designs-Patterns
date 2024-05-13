package dp.dip.payment;

import dp.dip.factory.DBProductFactory;
import dp.dip.model.Db;
import dp.dip.model.IDBProduct;
import dp.dip.model.MYSQLProduct;



public class Payment {
    public void pay(String productID){
        IDBProduct dbproduct = DBProductFactory.create(Db.MYSQL);
        String product = dbproduct.getProductById(productID);
        System.out.println(product);
    }
}
