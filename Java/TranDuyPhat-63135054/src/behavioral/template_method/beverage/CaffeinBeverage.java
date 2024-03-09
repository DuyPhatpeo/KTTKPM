package behavioral.template_method.beverage;

public abstract class CaffeinBeverage {
    abstract void brew();
    abstract void addCondiments();
    private void boidWater(){
        System.out.println("Đun sôi nước đền 100 dộ C!");
    }
    private void pourInCup(){
        System.out.println("Rót thức uống ra cốc!");
    }
    public void prepareRecipe(){
        boidWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
