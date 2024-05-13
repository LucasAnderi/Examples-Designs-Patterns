package dp.dip.model;

public class MongoDBProduct implements IDBProduct {
    @Override
    public String getProductById(String productID) {
        return "MongoDB: Exibindo dados da consulta"+productID;
    }
}
