package structural.decorator.maytinh;

public class Ram extends UpgradePC{
    String addRAM;
    float vaddRAM;

    public Ram(Computer computer, String addRAM, float vaddRAM) {
        super(computer);
        this.addRAM = addRAM;
        this.vaddRAM = vaddRAM;
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(computer.build()).append("\n");
        builder.append("Nâng cấp thêm RAM: ").append(addRAM)
                .append("Giá RAM: ")
                .append(vaddRAM);
        return builder.toString();
    }

    @Override
    float values() {
        return computer.values() + vaddRAM;
    }
}
