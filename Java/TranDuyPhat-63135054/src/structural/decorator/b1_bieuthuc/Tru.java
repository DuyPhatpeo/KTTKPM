package structural.decorator.b1_bieuthuc;

public class Tru extends BieuThuDecorator{
    float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + " - " + toanHang;
    }
}
