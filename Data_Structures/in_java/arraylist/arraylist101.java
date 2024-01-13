import java.util.ArrayList;

class arraylist101 {

    public static void main(String[] args) {
            // Create an ArrayList
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements to the ArrayList
    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Mango");
    
    // Access elements 
    System.out.println(fruits.get(0)); // Prints Apple

    // Iterate through the ArrayList
    for(String fruit : fruits) {
      System.out.println(fruit);
    }

    // Get ArrayList size
    int size = fruits.size();
    System.out.println(size);
    
    // Remove an element 
    fruits.remove("Mango");
    
    // Clear the ArrayList
    fruits.clear();

    // Inserting at a Specific Index:
    // fruits.add(1, "Banana"); inserts "Banana" at index 1.

    // Checking for an Element:
    // boolean hasApple = fruits.contains("Apple"); checks if "Apple" is present.

    // Finding an Element's Index:
    // int appleIndex = fruits.indexOf("Apple"); returns the index of "Apple", or -1 if not found.

    // Sorting the ArrayList:
    // Collections.sort(fruits); sorts the elements in ascending order.

    // Converting to an Array:
    // String[] fruitArray = fruits.toArray(new String[fruits.size()]); converts the ArrayList to a string array.
        
    }
}