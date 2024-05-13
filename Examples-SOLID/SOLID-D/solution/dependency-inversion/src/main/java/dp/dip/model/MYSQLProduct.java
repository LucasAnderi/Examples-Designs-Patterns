package dp.dip.model;
// low lvl class
public class MYSQLProduct implements IDBProduct {
    @Override
    public String getProductById(String productID) {
        return "mySQL: Exibindo dados da consulta: "+productID;
    }
}

