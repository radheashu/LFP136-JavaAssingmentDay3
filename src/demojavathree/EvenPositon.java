package demojavathree;

public class EvenPositon {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 8};
        System.out.println("Element of given array present on even position: ");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}