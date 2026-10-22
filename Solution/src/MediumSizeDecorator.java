public class MediumSizeDecorator extends SizeDecorator {
    public MediumSizeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }

    @Override
    public void getDescription() {
        System.out.print("Medium ");
        pizza.getDescription();
    }

    @Override
    public void getName() {
        System.out.print("Medium ");
        pizza.getName();
    }
}
