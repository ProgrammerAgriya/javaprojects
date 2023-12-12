import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("what's the tempreture outside? : ");
	//	String str = myObj.nextLine();
        int str = myObj.nextInt();
		


		while (true) {
		//boolean isInputaString = str.matches("[0-9]+");
		
		{
        	System.out.println("it is " + str + " degrees outside so...");
        	if(str < 40){
        		System.out.println("I will wear a jacket today");
              int result  =	calculateFactorialRecursicve (str);
                 System.out.println("the factorial of this tempreture is: " +result);
                 break;
        	//	break;
        	}else {
        		System.out.println("I won't wear a jacket today");
                 int result  =	calculateFactorialRecursicve (str);
                 System.out.println("the factorial of this tempreture is: " +result);
                 break;
        	}

            

        
    }

				
		
		
		

	}
}

	private static int calculateFactorialRecursicve(int number) {
		if (number == 0) {
			return 1;
		}else {
			return number * calculateFactorialRecursicve(number - 1);
		}
			
		
	}

    }

        
        
     

 
