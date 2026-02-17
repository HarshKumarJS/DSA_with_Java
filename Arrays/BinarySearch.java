public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7}; // sorted array
        int key = 6;               // element to search

        System.out.println(Binarysearch(arr, key));
    }

    // returns index of key if found, otherwise -1
    public static int Binarysearch(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2; // find middle index

            if (arr[mid] == key) {
                return mid;              // key found
            }
            else if (arr[mid] > key) {
                end = mid - 1;           // search left half
            }
            else {
                start = mid + 1;         // search right half
            }
        }

        return -1; // key not found
    }
}
