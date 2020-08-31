public class main {
    public static void main(String[] args) {
        obj a = new obj();
        //System.out.println(a.toRoman(1222));

        MyClass<Integer> obj1 = new MyClass<>(10);
        MyClass<Double> obj2 = new MyClass<>(10.5);

        obj1.showType();
        obj2.showType();
    }
}
