package abstractFactory;

public class Main {

    public static void main(String[] args) {
        Restaurant pizzeria = new Pizzeria();
        MainDish pizza = pizzeria.cookMainDish();
        SideDish lettuce = pizzeria.cookSideDish();
        pizza.eat();
        lettuce.eat();

        Restaurant fastFood = new FastFood();
        MainDish burger = fastFood.cookMainDish();
        SideDish frenchFry = fastFood.cookSideDish();
        burger.eat();
        frenchFry.eat();
    }
}
