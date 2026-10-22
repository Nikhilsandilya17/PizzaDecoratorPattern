public class CheesyCrustPizza implements Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public void getDescription() {
        System.out.println("Cheesy Crust Pizza");
    }

    @Override
    public void getName() {
        System.out.println("Cheesy Crust Pizza");
    }
}
