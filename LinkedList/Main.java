

public class Main {

    public static void main(String[] args) {

        Dictionary<String, Integer> dictionaryOne = new Dictionary<String, Integer>();

        System.out.println(dictionaryOne.isEmpty());

        dictionaryOne.add("Bob", 1);
        dictionaryOne.printList();
        System.out.println(" 1 ");

        dictionaryOne.add("Tim", 3);
        dictionaryOne.printList();
        System.out.println(" 2 ");

        dictionaryOne.add("Tim", 2);
        dictionaryOne.printList();
        System.out.println(" 3 ");

       /* dictionaryOne.add("Bob", 5);
        dictionaryOne.printList();
        System.out.println(" 4 ");

        dictionaryOne.remove("Jim");
        dictionaryOne.printList();
        System.out.println(" 5 ");

        dictionaryOne.add("Kim", 3);
        dictionaryOne.printList();
        System.out.println(" 6 ");

        dictionaryOne.add("John", 4);
        dictionaryOne.printList();
        System.out.println(" 7 ");

        dictionaryOne.remove("Bryan");
        dictionaryOne.printList();
        System.out.println(" 8 ");

        //dictionaryOne.clearDictionary();
        //dictionaryOne.printList();
        //System.out.println(" 8 ");

        System.out.print(dictionaryOne.getValue("John"));
        System.out.println(" 9 ");
        //dictionaryOne.getValue("Bob");
        dictionaryOne.getValue("Bryan");


        //dictionaryOne.add("Bob", 2);
        //dictionaryOne.printList();
        //System.out.println(" ");
        //dictionaryOne.add("Jim", 2);

        //dictionaryOne.remove("Bob");

*/


    }
}
