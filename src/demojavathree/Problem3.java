package demojavathree;

public class Problem3 {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,7,3,2,2,2,5,1};
        int max = arr[0];
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
        }
    }

