package behavioral.iterator.ce1_mang;

public class MainCE1 {
    public static void main(String[] args) {
        ArrayCollection collection = new ArrayCollection();
        MyIterator iterator = collection.createIterator();
        while (iterator.isDone())
            System.out.println(iterator.first());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.currtent());

    }
}
