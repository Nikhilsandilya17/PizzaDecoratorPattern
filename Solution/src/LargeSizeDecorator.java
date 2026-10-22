public class LargeSizeDecorator extends SizeDecorator {
    public LargeSizeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return (int) Math.round(pizza.getCost() * 1.5);
    }

    @Override
    public void getDescription() {
        System.out.print("Large ");
        pizza.getDescription();
    }

    @Override
    public void getName() {
        System.out.print("Large ");
        pizza.getName();
    }
}
