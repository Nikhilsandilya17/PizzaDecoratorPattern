public class OlivesToppingDecorator extends ToppingDecorator{

    public OlivesToppingDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public void getDescription() {

    }

    @Override
    public void getName() {

    }
}
