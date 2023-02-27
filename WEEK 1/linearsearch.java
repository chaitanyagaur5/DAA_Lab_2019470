public class LinearSearch {

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int x = 7;

        int index = linearSearch(arr, x);

        if (index == -1) {
            System.out.println("Element " + x + " not found in array");
        } else {
            System.out.println("Element " + x + " found at index " + index);
        }
    }
}
