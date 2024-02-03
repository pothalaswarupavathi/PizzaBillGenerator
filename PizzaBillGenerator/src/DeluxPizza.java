public class DeluxPizza extends Pizza{

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }

    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();

    }
}
