package creational.builder;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("i5 12400f")
                .addRAM("32GB")
                .addStorage("2TB MVMe")
                .addScreen("27 inches")
                .build();
        System.out.println(computer);
    }
}
