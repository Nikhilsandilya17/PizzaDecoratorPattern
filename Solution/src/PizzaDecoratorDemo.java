public class PizzaDecoratorDemo {
    public static void main(String[] args) {
        Pizza smallRegularCrustCheesePizza = new SmallSizeDecorator(new CheeseToppingDecorator(new RegularCrustPizza()));
        smallRegularCrustCheesePizza.getDescription();
        System.out.println(smallRegularCrustCheesePizza.getCost());
        Pizza largeThinCrustCheeseMushroomOlivePizza = new LargeSizeDecorator(new CheeseToppingDecorator(new MushroomToppingDecorator(new OlivesToppingDecorator(new ThinCrustPizza()))));
        largeThinCrustCheeseMushroomOlivePizza.getDescription();
        System.out.println(largeThinCrustCheeseMushroomOlivePizza.getCost());
    }
}
