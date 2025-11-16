
//Find the First Non-Repeating Character

void main() {

    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Enter a word");
        String word = scanner.next();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap();

        for(char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        char firstNonRepeating='\0';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                firstNonRepeating=entry.getKey();
                break;
            }
        }
        if(firstNonRepeating=='\0'){
            System.out.println("No non repeating character");
        } else {
            System.out.printf("The first non repeating char in word is %c", firstNonRepeating);
        }

    } catch(Exception e) {
        System.out.println(e);
    } finally {
        scanner.close();
    }

}
