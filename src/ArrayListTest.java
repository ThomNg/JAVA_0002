import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListTest {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceryList = new ArrayList<>();

        while(flag){
            printMenuText();
            switch(Integer.parseInt(sc.nextLine())){
                case 1 -> addItems(groceryList);
                case 2 -> remItems(groceryList);
                default -> flag = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    public static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate by comma]");
        String[] items = sc.nextLine().split(",");

        for (String item: items) {
            String trimmed = item.trim();
            if(!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }
    }
    public static void remItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [separate by comma]");
        String[] items = sc.nextLine().split(",");

        for (String item: items) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
    }

    public static void printMenuText(){
        String text = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(text+" ");

    }
}
