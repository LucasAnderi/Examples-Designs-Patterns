package dp.liskov;

public class DebitCard extends NubankCard{

    @Override
    public void validate() throws Exception{
        //validação do saldo do cartão de debito
        System.out.println("verificando saldo!");
        System.out.println("Saldo disponível");
    }

}
