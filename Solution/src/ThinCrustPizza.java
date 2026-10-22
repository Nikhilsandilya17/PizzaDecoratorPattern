public class ThinCrustPizza implements Pizza {
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public void getDescription() {
        System.out.println("Thin Crust Pizza");
    }

    @Override
    public void getName() {
        System.out.println("Thin Crust Pizza");
    }
}
