package behavioral.iterator.ce1_mang;

public class ArrayIterator implements MyIterator{
    ArrayCollection collection;
    int index = -1;
    protected  ArrayIterator(ArrayCollection array){
        this.collection = array;
    }
    @Override
    public Object first() {
        if(collection.count() > 0){
            index = 0;
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
        if(!isDone())
            return collection.getItem(++index);
        return null;
    }

    @Override
    public Object currtent() {
        if(index >= 0)
            return collection.getItem(index);
        return null;
    }

    @Override
    public boolean isDone() {
        return (index == collection.count() - 1);
    }
}
