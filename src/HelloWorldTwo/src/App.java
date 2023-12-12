import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("what's the tempreture outside? : ");
		String str = myObj.nextLine();
        int itsNotAForkingString = Integer.parseInt(str);
        
		
		while (true) {
		boolean isInputaString = str.matches("[0-9]+");
		
		if(isInputaString == false){
            System.out.println("\nYou entered a non number ");
            System.out.println("Remove all non numbers from your input and try again !");
            str = myObj.nextLine();
        }else{
        	System.out.println("it is " + str + " degrees outside so...");
        	if(Integer.parseInt(str) < 40){
        		System.out.println("I will wear a jacket today");
              long result  =	calculateFactorialUsingForLoop(Integer.parseInt(str));
                 System.out.println(result);
                 break;
        	}else {
        		System.out.println("I won't wear a jacket today");
        	}


        }

    }
        	

            


        
    }

		  static long calculateFactorialUsingForLoop(int number) {

         //   int num = TAKE THE GODDAMN INTEGER YOU USELESS PIECE OF SHIT;

            long fact = 1;

           for (int i = 1; i < number; i++) {

            fact = fact * i;

             }
            System.out.println("Factorial of this tempreture is:" +fact);

        return fact;
}		
		
		
		

	}
  
       // static int calculateFactorialUsingForLoop(int number) {

         //   int num = result;

           // long fact = 1;

           //for (int i = 0; i < result; i++) {

            //fact = fact * i;

           //  }
           // System.out.println("Factorial of this tempreture is:" +fact);

    

        
        
     

 
