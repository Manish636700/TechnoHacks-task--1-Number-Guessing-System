import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String args[])
    {
        GuessTheNumber();
    }
    public static void GuessTheNumber()
    {
        Scanner sc = new Scanner(System.in);
        Random number = new Random(0);
        
        int lowerNumber = 1;
        int higherNumber = 100;
        int attempts = 5;
        int score = 0;

        boolean playagain = true;

        System.out.println("Welcome to Number Guessing Game");
        while(playagain)
        {
            int targetnumber = number.nextInt(higherNumber-lowerNumber+1)+lowerNumber;
            int attemp = 0;
            boolean numberCorrectly = false;
            
            System.out.println("\n guessing the number  "+  lowerNumber  + " and " + higherNumber + ".");
            System.out.println("you have guessing number attempts" + attempts);

            while(attemp < attempts && !numberCorrectly)
            {
                System.out.println("Enter the guess number : ");
                float userGuessNumber = sc.nextFloat();
                sc.nextLine();

                attemp++;

                if(userGuessNumber == targetnumber)
                {
                    System.out.println("Congratulations! you gussed the number correctly.");
                    numberCorrectly = true;

                }else if(userGuessNumber<targetnumber)
                        {
                            System.out.println("lower");
                        }
                      else{
                        System.out.println("Higher");
                        }

            }score = score+(attempts-attemp+1);
            System.out.println("Your score: " + score);
            if(!numberCorrectly)
            {
                System.out.println("Oops! you run out . the number was :"+ targetnumber);

            }
            System.out.println("your Score" + score);

            System.out.println("\n you want to play again? (yes/no)");
            String input = sc.nextLine().toLowerCase();

            if(!input.equals("yes"))
            {
                playagain = false;
            }
        }
        System.out.println("thank you");
    }
    
}
