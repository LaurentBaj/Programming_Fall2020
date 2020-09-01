import org.w3c.dom.Node;

public class main {
    public static void main(String[] args) {
        obj a = new obj();
        //System.out.println(a.toRoman(1222));

        MyClass<Integer> obj1 = new MyClass<>(10);
        MyClass<Double> obj2 = new MyClass<>(10.5);

        obj1.showType();
        obj2.showType();

        LinkedListLogic c = new LinkedListLogic();
        c.insertAtBeginning(4);
        c.addToLastElement(5);
        c.addToLastElement(6);

        // Can't print values in linked list c
        // Not sure if any of the methods done on c actually worked
        c.printAll();

        LinkedList2 d = new LinkedList2();
        d.append(2);
        d.prepend(4);

        System.out.println(d.getItem(2));
    }
}
