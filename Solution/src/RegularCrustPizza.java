public class RegularCrustPizza implements Pizza {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDescription() {
        System.out.println("Regular Crust Pizza");
    }

    @Override
    public void getName() {
        System.out.println("Regular Crust Pizza");
    }
}
