package creational.factory.pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType pizzaType);
    Pizza order(PizzaType pizzaType){
        Pizza p = createPizza(pizzaType);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
