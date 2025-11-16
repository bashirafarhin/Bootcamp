
//You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list.

void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter sorted array1 elements separated as space");

    String line1 = scanner.nextLine();
    String[] tokens1 = line1.split(" ");

    ArrayList<Integer> arr1 = new ArrayList<>();
    for (String token : tokens1) {
        arr1.add(Integer.parseInt(token));
    }

    System.out.println("Enter sorted array2 elements separated as space");

    String line2 = scanner.nextLine();
    String[] tokens2 = line2.split(" ");

    ArrayList<Integer> arr2 = new ArrayList<>();
    for (String token : tokens2) {
        arr2.add(Integer.parseInt(token));
    }

    ArrayList<Integer> arr3 = new ArrayList<>();

    int i = 0, j = 0;

    while (i < arr1.size() && j < arr2.size()) {
        if (arr1.get(i) <= arr2.get(j)) {
            arr3.add(arr1.get(i));
            i++;
        } else {
            arr3.add(arr2.get(j));
            j++;
        }
    }

    // Add remaining elements
    while (i < arr1.size()) {
        arr3.add(arr1.get(i));
        i++;
    }

    while (j < arr2.size()) {
        arr3.add(arr2.get(j));
        j++;
    }

    System.out.println("Merged sorted list: " + arr3);
    scanner.close();


}
