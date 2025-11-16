import java.util.ArrayList;
import java.util.Scanner;

// Static Counter
// Create a class where every time an object is created, a static counter increases.
// Print how many objects have been created.

public class Main {
    public static void main(String[] args) {

        ObjectsCounter objectsCounter1 = new ObjectsCounter();
        ObjectsCounter objectsCounter2 = new ObjectsCounter();
        ObjectsCounter objectsCounter3 = new ObjectsCounter();
        System.out.println(objectsCounter3.getCountOfObjects());

    }
}