// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Pizza basePizza=new Pizza(false);
//        basePizza.addExtraCheese();
//
//        basePizza.getBill();
        DeluxPizza dp=new DeluxPizza(true);
        dp.addExtraToppings();
        dp.addExtraCheese();

        dp.takeAway();
        dp.getBill();


    }
}