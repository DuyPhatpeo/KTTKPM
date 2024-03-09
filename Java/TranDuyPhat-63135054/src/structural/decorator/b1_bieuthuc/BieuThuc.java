package structural.decorator.b1_bieuthuc;

public abstract class BieuThuc {

    public abstract float giaTri();

    public abstract String bieuThuc();

    @Override
    public String toString() {
        return bieuThuc() + " = " + giaTri();
    }
}
