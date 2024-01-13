public class array101 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the first element of the array
        System.out.println("The first element is: " + numbers[0]);

        // Print all elements of the array using a loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Modify the third element of the array
        numbers[2] = 10;

        // Print the modified array
        System.out.println("Modified array:");
        for (int number : numbers) {
            System.out.println(number);
        }
        // System.out.println(numbers); <--(this is wrong )
        
        //Arrays.binarySearch(): Find the index of a specific value in a sorted array using binary search
        // (efficient for large arrays)
        int index = Arrays.binarySearch(numbers, 5);

        //Arrays.sort(): Sort the elements in ascending order using various sorting algorithms 
        //(e.g., quicksort, merge sort)
        Arrays.sort(numbers);

        //Arrays.copyOf(): Create a new array with a copy of all or part of the original array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);

        //Arrays.equals(): Check if two arrays have the same elements in the same order
        boolean areEqual = Arrays.equals(numbers1, numbers2);

        //Arrays.fill(): Set all elements of an array to a specific value.
        Arrays.fill(numbers, 0);

        //Create arrays with multiple dimensions to represent matrices or other data structure
        int[][] matrix = new int[3][4];  // A 3x4 matrix






    


    }
}
