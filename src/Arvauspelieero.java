import java.util.Scanner;

public class Arvauspelieero {
    public static void main(String[] args) {
    	/// Scanneri käyttäjänsyötettä varten.
        Scanner in = new Scanner(System.in);
        int guessCount = 0;
        
        System.out.println("Guess my name (type stop to exit)");
        String guess;

        do {
            guess = in.nextLine();
            
            String excludedWord = "stop";
                       

            if (guess.equalsIgnoreCase(excludedWord)) {
                
                break;
                
            } else {
            	
            guessCount++;
                
            String correctName = "Emma";
            
           } if(guess.equalsIgnoreCase("Emma")) {
                System.out.println("Congratulations!");
                break;
            }

              else {

        	System.out.println("Guess my name (type stop to exit)");
           }
        }while(true);
        
        System.out.println("You guessed " + guessCount + " times.");
        System.out.println("Thank you for playing! Please come again!");
}}