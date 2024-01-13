import java.util.LinkedList; 

/**
 * linkedlist101
 */
public class linkedlist101 {

    public static void main(String[] args) {
    // Create a LinkedList
    LinkedList<String> animals = new LinkedList<>();
    
    // Add elements to the LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");

    // Add elements at specific index
    animals.add(1, "Elephant"); 

    // Access elements from the LinkedList
    String str = animals.get(0); 
    System.out.println(str);

    // Iterate through the LinkedList
    for(String animal : animals) {
      System.out.println(animal); 
    }

    // Remove elements from LinkedList 
    animals.remove("Cat");

    // Clear all elements from LinkedList
    animals.clear();
    
    // Add elements to front and back
    animals.addFirst("Monkey");
    animals.addLast("Lion");
    



    }
}