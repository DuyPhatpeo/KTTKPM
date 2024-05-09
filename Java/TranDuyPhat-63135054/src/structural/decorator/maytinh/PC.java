package structural.decorator.maytinh;

public class PC extends Computer{
    public PC(String cpu, String ram, String storage, String screen, String mainboard, int vCpu, int vRam, int vStorage, int vScreen, int vMainboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.mainboard = mainboard;
        this.vCpu = vCpu;
        this.vRam = vRam;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
        this.vMainboard = vMainboard;
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder()
                .append(mainboard)
                .append("\n")
                .append(cpu)
                .append("\n")
                .append(ram)
                .append("\n")
                .append(storage)
                .append("\n")
                .append(screen);
        return builder.toString();
    }

    @Override
    float values() {
        return vCpu + vRam + vStorage + vScreen + vMainboard;
    }
}
