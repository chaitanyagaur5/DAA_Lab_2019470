public class Jumpsearch{

    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);

        int prev = 0;
        while (arr[Math.min(step, n)-1] < x) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        while (arr[prev] < x) {
            prev++;

            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev] == x)
            return prev;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int x = 7;

        int index = jumpSearch(arr, x);

        System.out.println("Element " + x + " is at index " + index);
    }
}
