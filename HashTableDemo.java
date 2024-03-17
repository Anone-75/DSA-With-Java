import java.util.*;

class HashTable {
    private final int SIZE = 10;
    private LinkedList[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, Object value) {
        int hash = hash(key);
        LinkedList<Entry> list = table[hash];
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new Entry(key, value));
    }

    public Object get(int key) {
        int hash = hash(key);
        LinkedList<Entry> list = table[hash];
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }

    static class Entry {
        private final int key;
        private Object value;

        public Entry(int key, Object value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(11, "Eleven");

        System.out.println(ht.get(1));  // Output: One
        System.out.println(ht.get(11)); // Output: Eleven
    }
}
