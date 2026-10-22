public class MushroomToppingDecorator extends ToppingDecorator {
    public MushroomToppingDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public void getDescription() {

    }

    @Override
    public void getName() {

    }
}
