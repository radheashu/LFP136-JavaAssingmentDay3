package demojavathree;

public class OddPosition {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5};
        System.out.println("Eelement of given array present on odd position:  ");
        for (int i =0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }

        }
    }



