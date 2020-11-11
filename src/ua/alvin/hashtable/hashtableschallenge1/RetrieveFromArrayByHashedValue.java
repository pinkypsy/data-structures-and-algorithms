package ua.alvin.hashtable.hashtableschallenge1;

public class RetrieveFromArrayByHashedValue {

    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43,5, 6894, 500, 99, -58 };
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int hash(int value) {
return Math.abs(value % 10); //order based on one's
//return Math.abs(value / 10 % 10); //order based on ten's
/*but it shouldn't be greater than smallest number in the array, otherwise this number gonna be overwritten by 0*/
    }
}
