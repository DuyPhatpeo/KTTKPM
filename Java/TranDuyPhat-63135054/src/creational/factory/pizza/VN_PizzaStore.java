package creational.factory.pizza;

import creational.factory.pizza.vn.VN_HaiSanPizza;
import creational.factory.pizza.vn.VN_NamPizza;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        Pizza p;
        switch (pizzaType){
            case HAI_SAN -> {
                return new VN_HaiSanPizza();
            }
            case NAM -> {
                return new VN_NamPizza();
            }
        }
        return null;
    }
}
