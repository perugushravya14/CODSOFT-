import java.util.Random;
import java.util.Scanner;
public class NumberGame{
  public static void main(String args[])
  {
    Random RandomNumber=new Random();
    Scanner s=new Scanner(System.in);
    int NumbertoGuess=RandomNumber.nextInt(100)+1;
    int userinput=0;
    int NumberofAttempts=0;
    System.out.println("Welcome to the Number Guessing Game.");
    System.out.println("Guess a Number between 1 To 100");
    while(userinput!=NumbertoGuess)
      {
        System.out.println("Enter the Guessed number");
        userinput=s.nextInt();
        NumberofAttempts++;
        if(userinput<NumbertoGuess)
        {
          System.out.println("Too low.Try again.");
        }
        else if(userinput>NumbertoGuess)
        {
          System.out.println("Too high.Try again.");
        }
        else if(NumberofAttempts>10)
        {
          System.out.println("You have exceeded the maximum number of attempts.");
          System.out.println("The correct number was "+NumbertoGuess);
          System.out.println("Better luck next time.");
          break;
        }
        else
        {
          System.out.println("Congratulations.You guessed the number "+NumbertoGuess+" in "+NumberofAttempts+" attempts.");
          s.close();
        }
      }
  }
}
