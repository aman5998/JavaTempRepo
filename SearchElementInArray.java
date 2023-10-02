public class SearchElementInArray {
    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[];
        // arr = new int[7];
        int arr[] = new int[] { 11, 22, 33, 44, 55, 66, 77 };
        int target = 77;
        int ansIndex = search(arr, target);
        if (ansIndex == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at Index: " + ansIndex);
    }
}
