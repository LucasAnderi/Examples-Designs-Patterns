package dp.dip.factory;

import dp.dip.model.Db;
import dp.dip.model.IDBProduct;
import dp.dip.model.MYSQLProduct;
import dp.dip.model.MongoDBProduct;

public class DBProductFactory {
    public static IDBProduct create(Db type){

        if(type == Db.MYSQL){
            return new MYSQLProduct();
        }else{
            return new MongoDBProduct();
        }

    }
}
