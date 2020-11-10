package ua.alvin.hashtable;

import ua.alvin.queue.ArrayQueue;

public class ArrayHashTable <V> {

    private V [] table;

    public  ArrayHashTable (){
        table = (V[]) new Object[16];
    }

    private <K> int hashKey(K key){
        System.out.println("hashCode of " + key + " is " + key.hashCode());
        return Math.abs(key.hashCode() % table.length);
    }

    public <K> void put(K key, V value){
        int hashKey = hashKey(key);
        if (table[hashKey] != null){
            System.out.println("Index " + hashKey + " is occupied");
        }
        table[hashKey] = value;
    }

    public <K> V getValue(K key){
        int hashKey = hashKey(key);
        return table[hashKey];
    }

    public void print(){

        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) continue;
            System.out.println(i + ": " + table[i]);
        }
    }

}
