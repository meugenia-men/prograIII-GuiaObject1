public class Bank {
    private Integer id;
    private String name;
    private Float balance;

    public Bank() {
    }

    public Bank(Integer id, String name, Float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public void credit(Float quantity,Bank x){
        Float newBalance= x.balance+quantity;
        this.balance=newBalance;
    }

    public void debit(Float quantity, Bank x){
        Float newBalance= x.balance-quantity;
        if(newBalance>0){
            this.balance=newBalance;
        }
        else{
            System.out.println("No se pudo realizar la operacion.Saldo Insuficiente");
        }
    }

    public void account(Bank x){
        System.out.println("[Nro de Cuentea="+x.id+"] [Nombre="+x.name+"] [Balance="+x.balance+"]");
        System.out.println("_________________________________________________________");
    }
}
