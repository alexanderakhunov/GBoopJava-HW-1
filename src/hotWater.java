public class hotWater extends Product{
    private int temper;

    hotWater(String name, int temper, int volume, int price){
        super.name = name;
        this.temper = temper;
        super.price = price;
        super.volume = volume;
    }

    @Override
    public String toString() {
        return "hotWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", temper=" + temper +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }
}
