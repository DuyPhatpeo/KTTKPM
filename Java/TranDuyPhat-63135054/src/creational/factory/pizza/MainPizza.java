package creational.factory.pizza;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore vnPizzaStore = new VN_PizzaStore();
        Pizza p = vnPizzaStore.order(PizzaType.HAI_SAN);
        System.out.println(p.toString());
        System.out.println();
        Pizza p1 = vnPizzaStore.order(PizzaType.NAM);
        System.out.println(p1.toString());
        System.out.println();
        PizzaStore krPizzaStore = new Korean_PizzaStore();
        Pizza p2 = krPizzaStore.order(PizzaType.HAI_SAN);
        System.out.println(p2.toString());

    }
}
