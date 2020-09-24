package ExerciceHash;

public class SimpleHashTable {
    private Employee[] hashTable;

    public SimpleHashTable() {
        hashTable = new Employee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
}
