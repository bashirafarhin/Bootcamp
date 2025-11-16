import static java.util.Collections.sort;

//Given an array of integers and a target sum, return the indices of the two numbers that add up to the target

void main() {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array elements separated as space");

    String line = scanner.nextLine(); // read the whole line
    String[] tokens = line.split(" "); // split by space

    ArrayList<Integer> arr = new ArrayList<>();
    for (String token : tokens) {
        arr.add(Integer.parseInt(token)); // convert to integer
    }

    System.out.println("Enter target");
    int target = scanner.nextInt();


    int start=0;
    int end=arr.size()-1;
    sort(arr);

    while(start<end){
        int currTarget = arr.get(start)+arr.get(end);
        if(target==currTarget){
            System.out.printf("The numbers whose sum is equal to the target are %d and %d", arr.get(start), arr.get(end));
            return ;
        }
        if(target>currTarget){
            start++;
        } else {
            end--;
        }
    }
    System.out.println("There are no numbers whose sum is equal to the target");
    scanner.close();
}
