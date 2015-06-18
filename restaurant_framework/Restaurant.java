import java.util.Scanner;
public class restaurant{

    final static String COLOR_ITEM = "\u001B[100m";
    final static String COLOR_PRICE = "\u001B[40m";
    final static String COLOR_ALLOWANCE = "\u001B[40m";
    final static String COLOR_FAILURE = "\u001B[41m";
    final static String COLOR_RESET = "\u001B[0m";

    public static void printMenu(){
        int i = 1;
        String amt;
        for(Menu item: Menu.values()){
            amt = String.format("%.2f",item.price());
            System.out.print(COLOR_ITEM + i + ") " + item + ":\t " + amt + COLOR_RESET + "\n");
            ++i;
        }

        System.out.print(COLOR_ITEM + i + ") EXIT" + COLOR_RESET + "\n");
    }

    public static void printAllowance(double allowance){
        String amt = String.format("%.2f", allowance);
        System.out.print(COLOR_ALLOWANCE + "You have $" + amt + " remaining." + COLOR_RESET + "\n");
    }

    public static void printFailure(String item){
        System.out.print(COLOR_FAILURE + "You do not have enough money" + COLOR_RESET +"\n" + COLOR_FAILURE + "remaining to purchase " + item + COLOR_RESET + "\n");
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        double allowance = 10.00;
        double pizzaPrice = 2.50;
        double iceCreamPrice = 2.00;
        double sodaPrice = 1.50;

        while(allowance >= 1.50){ /* FIX WHILE CONDITION */
            printAllowance(allowance);
            printMenu();
	   
            input = scan.nextInt();
            if(input== 1){ //PIZZA costs 2.50
		if(allowance < pizzaPrice){
		    printFailure("Pizza");	    
                }   
                else{
 	            allowance = allowance - pizzaPrice;
                }
            }

		else if(input== 2){ //ICE CREAM costs 2.00
		         if(allowance < iceCreamPrice){
                             printFailure("Ice Cream");
                }
                else{
                    allowance = allowance - iceCreamPrice;
                }
            }
	    else if(input== 3){ //Soda costs 1.50
   		     if(allowance < sodaPrice){
                         printFailure("Soda");
                }
                else{
                    allowance = allowance - iceCreamPrice;
                }
            } 
            else{
                System.out.println("Goodbye");

            }
           
            /**
             *
             * ENTER YOUR CODE HERE
             *
             * HINTS:
             * printFailure("Soda"); -- prints "You do not have enough money remaining to purchase Soda"
             * printFailure("Ice Cream"); -- prints "You do not have enough money remaining to purchase Ice Cream"
             * printFailure("Pizza"); -- prints "You do not have enough money remaining to purchase Pizza"
             *
             */
        }

    }
}
