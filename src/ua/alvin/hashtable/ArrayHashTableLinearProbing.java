package ua.alvin.hashtable;

import ua.alvin.entity.Employee;
import ua.alvin.entity.EmployeeStored;

public class ArrayHashTableLinearProbing {

    private EmployeeStored[] table;

    public ArrayHashTableLinearProbing(){
        table = new EmployeeStored[10];
    }

    private int hashKey(String key){
        int result = key.length() % table.length;
//        System.out.println("hashKey of " + key + " is " + result);
        return result;
    }

    public void put(String key, Employee value){
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)){
            int stopIndex = hashedKey;
            if (hashedKey == table.length-1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }

            while (isOccupied(hashedKey) &&
                    hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % table.length;
            }

        }


        if (table[hashedKey] != null){
            System.out.println("Index " + hashedKey + " is occupied");
        }
        table[hashedKey] = new EmployeeStored(key,value);
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);

        if (table[hashedKey] != null &&
                table[hashedKey].getKey().equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == table.length-1){
            hashedKey = 0;
        }else{
            hashedKey++;
        }

        while (table[hashedKey] != null &&
                !table[hashedKey].getKey().equals(key) &&
                hashedKey != stopIndex){
            hashedKey = (hashedKey + 1) % table.length;
        }

        if (table[hashedKey] != null &&
                table[hashedKey].getKey().equals(key)){
            return hashedKey;
        }else {
            return -1;
        }

    }

    private boolean isOccupied(int index){
        if (table[index] != null){
            return true;
        }
        else return false;
    }

    public Employee getValue(String key){
        int hashKey = findKey(key);
        System.out.println("Key is: " + key);
        if (hashKey == -1){
            return null;
        }
        return table[hashKey].getEmployee();
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }

        Employee employee = table[hashedKey].getEmployee();
        table[hashedKey] = null;

        rehash();

        return employee;
    }

    private void rehash(){
        EmployeeStored [] oldTable = table;
        table = new EmployeeStored[oldTable.length];

        for (int i = 0; i < oldTable.length; i++) {
            if (oldTable[i] != null) {
                put(oldTable[i].getKey(), oldTable[i].getEmployee());
            }
        }
    }


    public void print(){
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) continue;
            System.out.println(i + ": " + table[i]);
        }
    }

}
