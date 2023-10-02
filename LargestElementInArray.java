public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 22, 55, 77, 33, 44, 66, 1212 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
