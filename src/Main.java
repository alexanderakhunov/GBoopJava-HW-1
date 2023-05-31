import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
   HotWaterVendingMachine hWvM = new HotWaterVendingMachine();
   Product tea = new hotWater("tea",75,500,100);
   Product coffe = new hotWater("coffe",80,100,200);
   Product burnoff = new hotWater("burnoff", 80,350,150);
   LinkedList<Product> hotProducts = new LinkedList<>();
   hotProducts.add(tea);
   hotProducts.add(coffe);
   hotProducts.add(burnoff);
   hWvM.putProduct(hotProducts);
        System.out.println(hWvM.getProduct());
        System.out.println(hWvM.getProduct("tea", 500, 75));

    }
}
