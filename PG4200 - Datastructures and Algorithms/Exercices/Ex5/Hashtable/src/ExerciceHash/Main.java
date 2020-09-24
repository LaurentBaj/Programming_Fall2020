package ExerciceHash;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Laurent", "Bajrami", 333);
        Employee e2 = new Employee("Ben", "Bajrami", 334);
        Employee e3 = new Employee("Gard", "Jørstad", 222);
        Employee e4 = new Employee("Alexander", "Gustavson", 311);
        Employee e5 = new Employee("Emil", "Skolt", 234);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Bajrami", e1);
        ht.put("Bajrami", e2);
        ht.put("Jørstad", e3);
        ht.put("Gustavson", e4);
        ht.put("Skolt", e5);

        ht.printHashtable();
    }
}
