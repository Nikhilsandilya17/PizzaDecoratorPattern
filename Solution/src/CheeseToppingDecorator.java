public class CheeseToppingDecorator extends ToppingDecorator {
    public CheeseToppingDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public void getDescription() {
        System.out.println("Cheese Topping Decorator");
    }

    @Override
    public void getName() {

    }
}
