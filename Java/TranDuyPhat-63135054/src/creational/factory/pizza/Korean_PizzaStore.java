package creational.factory.pizza;

import creational.factory.pizza.kr.Korea_HaiSanPizza;

public class Korean_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        Pizza p;
        switch (pizzaType){
            case HAI_SAN -> {
                return new Korea_HaiSanPizza();
            }
        }
        return null;
    }
}
