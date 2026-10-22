public abstract class SizeDecorator implements Pizza {
    protected Pizza pizza;

    public SizeDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
