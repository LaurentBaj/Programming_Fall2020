package ExerciceHash;

public class SimpleHashTable {
    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    // Insert K and V
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) { // Linear Prob - Here 🎶
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }                           // To here 🎶

        if (occupied(hashedKey)) { // This is redundant but does not affect time Comp - provides the message
            System.out.println("Sorry, there's already an emplyee at position " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee); // Assign employee
        }
    }

    // Get a specific value
    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    // Hash key (Give it a int value which it will use to find a slot into the table)
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] == null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex
                && hashTable[hashedKey] != null
                && !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (stopIndex == hashedKey) {
            return -1;
        } else {
            return hashedKey;
        }
    }

    // Linear Probing (Collision handling)
    private boolean occupied( int index) {
        return hashTable[index] != null;
    }


    // Output
    public void printHashtable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println("Position " + i + ": " + hashTable[i].employee);
            }
            System.out.println(hashTable[i].employee);
        }
    }
}
