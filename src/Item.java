public class Item {
    private Integer id;
    private String description;
    private Integer amount;
    private Float unitPrice;

    public Item() {
    }

    public Item(Integer id, String description, Integer amount, Float unitPrice) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float totalPrice(Integer amount, Float unitPrice){
        Float total = (float) amount*unitPrice;
        return total;
    }
    public void printItem(Item x){
        Float total=totalPrice(x.amount,x.unitPrice);
        System.out.println("Item de venta = [ID="+x.id+"] [Descripcion="+x.description+"] [Cantidad="+x.amount+"] [P.Unitario="+x.unitPrice+"] [P.Total="+total+"]");
        System.out.println("_______________________________________________________________________________________________");
    }
}
