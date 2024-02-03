public class Pizza {
    private int price;
    private boolean veg;


    private int addExtraCheesePrice=100;
    private int addExtraToppingsPrice=150;

    private int takeAwayPrice=20;

    private int basePizzaPrice;


    private boolean isExtraCheeseAdded= false;
    private boolean isExtraToppingsAdded= false;
     private boolean isExtraTakingAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;

    }


    public void addExtraCheese(){
        isExtraCheeseAdded=true;

        this.price +=addExtraCheesePrice;

    }


    public void addExtraToppings(){
        isExtraToppingsAdded=true;

        this.price += addExtraToppingsPrice;

    }

    public void takeAway(){
        isExtraTakingAway=true;

        this.price += takeAwayPrice;

    }





    public void getBill(){
        String bill="";
        System.out.println("Pizza:"+ basePizzaPrice);

        if(isExtraCheeseAdded){
            bill +="Extra Cheese added :"+ addExtraCheesePrice +"\n";
        }
        if(isExtraToppingsAdded){
            bill +="Extra Toppings added :"+ addExtraToppingsPrice +"\n";
        }

        if(isExtraToppingsAdded){
            bill +="Extra backPack added :"+ takeAwayPrice +"\n";
        }


        bill += " Total Bill:"+this.price +"\n";
        System.out.println(bill);

    }


}
