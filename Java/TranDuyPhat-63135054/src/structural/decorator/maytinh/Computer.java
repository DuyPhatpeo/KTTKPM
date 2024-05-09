package structural.decorator.maytinh;

public abstract class Computer {
    String cpu, ram, storage, screen, mainboard;
    int vCpu, vRam, vStorage, vScreen, vMainboard;


    abstract String build();
    abstract float values();


    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public String getMainboard() {
        return mainboard;
    }

    public int getvCpu() {
        return vCpu;
    }

    public int getvRam() {
        return vRam;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }

    public int getvMainboard() {
        return vMainboard;
    }
}
