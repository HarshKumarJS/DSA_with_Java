public class LinearSearch {

    public static void main(String[] args) {

        // Initialize the array to search in
        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        // Element to be searched
        int key = 8;

        // Call the linear search method
        int index = keyfinder(arr, key);

        // Check if the element was found
        if (index == -1) {
            System.out.println("The key does not exist in the array.");
        } else {
            System.out.println("The key is at " + index + " index.");
        }
    }

    public static int keyfinder(int[] arr, int key) {

        // Traverse the array one element at a time
        for (int i = 0; i < arr.length; i++) {

            // Check if the current element matches the key
            if (arr[i] == key) {
                return i; // Key found, return index
            }
        }
        // Key not found in the array
        return -1;
    }
}