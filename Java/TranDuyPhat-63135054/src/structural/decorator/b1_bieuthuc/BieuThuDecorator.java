package structural.decorator.b1_bieuthuc;

public abstract class BieuThuDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThuDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
