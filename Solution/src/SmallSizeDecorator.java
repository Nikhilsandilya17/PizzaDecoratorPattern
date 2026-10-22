public class SmallSizeDecorator extends SizeDecorator {
    public SmallSizeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return (int) Math.round(pizza.getCost() * 0.75);
    }

    @Override
    public void getDescription() {
        System.out.print("Small ");
        pizza.getDescription();
    }

    @Override
    public void getName() {
        System.out.print("Small ");
        pizza.getName();
    }
}
