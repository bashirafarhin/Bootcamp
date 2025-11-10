public class ObjectsCounter {
    private static int counter=0;

    ObjectsCounter() {
        counter++;
    }

    int getCountOfObjects() {
        return counter;
    }

}
