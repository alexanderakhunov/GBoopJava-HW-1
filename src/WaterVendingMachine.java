import java.util.LinkedList;

public class WaterVendingMachine implements VendingMachine{
private LinkedList<Product> waters;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }

    @Override
    public Product getProduct(String name, int volume, int temper) {
        return null;
    }
}
