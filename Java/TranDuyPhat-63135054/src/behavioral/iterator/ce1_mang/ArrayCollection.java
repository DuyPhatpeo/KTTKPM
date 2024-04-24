package behavioral.iterator.ce1_mang;

import java.util.Collection;

public class ArrayCollection extends MyCollection{
    private int[] arr = {1,2,3,4,5,6,7,8,9,10};
    public int getItem(int i){
        return arr[i];
    }
    public int count(){
        return arr.length;
    }

    @Override
    public MyIterator createIterator() {
        return new ArrayIterator(this);
    }
}
