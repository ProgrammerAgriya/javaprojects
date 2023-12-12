import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner buyFruit = new Scanner(System.in);
		System.out.println("Hello welcome to ALDI ! What are you looking for? : ");
        String choosenFruit = buyFruit.next();
        System.out.println("you asked for a " + choosenFruit + ", lets see how much it costs..");


          String[] fruits = {"Mango", "Kiwi", "Banana", "Strawberry", "Cherries", "Blackberry"};
        int[] nums = {18, 383, 193, 27, 2763, 0};

        boolean caseSensitive = containsCaseInsensitive(choosenFruit , Arrays.asList(fruits));
        //System.out.println(caseSensitive);

        if(caseSensitive){
            // get the index of choosenFruit
           for (int i = 0 ; i < fruits.length ; i++){
                if (fruits[i].equalsIgnoreCase(choosenFruit)) {
                    int fruitPrice = nums[i];
        System.out.println("The fruit " + choosenFruit + " costs " + fruitPrice + "  dollars per piece.");
                }
            }
        }else {
        System.out.println("Sorry, that fruit " +  choosenFruit + " is not in stock :(");
    }
     Scanner amountPaid = new Scanner(System.in);
		System.out.println("How much of the fruit are you willing to buy? : ");
        int totalEnd = amountPaid.nextInt();
        System.out.println("your total amount paid is : " + totalEnd *fruitPrice);
    



    }
private static void printfrtsandnums(String[] fruits, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("the fruit " + fruits[i] + " costs " + nums[i] + " dollars.");
}
}
    
    private static String choosenFruit(String string) {
    return null;
}
    private static void printallnums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
    }

}

    private static void printallfruits(String[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
    }
}

public static boolean containsCaseInsensitive(String s, List<String> l){
        return l.stream().anyMatch(x -> x.equalsIgnoreCase(s));
    }


 private static void reciptCalculated(String[] fruits) {
        for (fruitPrice * t) {
            System.out.println(result);
    }
}

}

//int i = 0; i < fruits.length; i++