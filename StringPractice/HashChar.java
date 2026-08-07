package StringPractice;

import java.util.ArrayList;

public class HashChar {
    private final int bucket;
    private final ArrayList<Character>[] table;

    public HashChar(int bucket) {
        this.bucket = bucket;
        this.table = new ArrayList[bucket];
        for (int i = 0; i < bucket; i++) {
            table[i] = new ArrayList<>();
        }
    }

    public int hashFunction(char key) {
        return (key % bucket);
    }

    public void insertItem(char key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

}
