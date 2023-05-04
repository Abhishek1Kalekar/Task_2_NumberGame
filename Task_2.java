
import java.util.Random;
import java.util.Scanner;

class Task_2 
{
  public static void main(String Abhi[])
  {
    System.out.print("Welcome To the Number Guessing Game :) \n");

    Scanner s=new Scanner(System.in); // to take input

    Random random=new Random();
    int number = random.nextInt(100) + 1; // To Generate Random Number from 1 to 100
    int Attempts=0;
    int Score=0;
     
    while(true)
    {
     
      System.out.print("Enter your Guess between 1 to 100 : ");
      int guess=s.nextInt();
      Attempts++;

      if(guess==number)
      {
        System.out.println("Congratulations......Your guess is correct..\nYou Guess The number in "+Attempts+" Attempts");

        Score += (100/Attempts); // Score= Score + (100/  Attempts)
        System.out.print("Your Score is : "+Score);  
        
        System.out.print("\nDo you want to play Again (y/n) :\n");
        String play=s.next();
         
        
        if (play.equalsIgnoreCase("y"))
        {
           number = random.nextInt(100) + 1; // To Generate Random Number from 1 to 100
           Attempts=0;
        }
        else
        {
           break; // to exit from current statement.
        }

      }
      else if( guess>number)
      {
        System.out.print(" Your Guess is High... Try Again\n");
      }
      else
      {
         System.out.print(" Your Guess is Low...Try Again\n");

      }

      if(Attempts>=10)
      {
        System.out.print(" Sorry... You Exceedes the Maximum Limit of Attempts...\n");
        System.out.println("   The Number Was : "+number );
        System.out.println("Do you want to play Again (y/n) : ");
        String play=s.next();

        if(play.equalsIgnoreCase("y"))
        {
           number = random.nextInt(100) + 1; // To Generate Random Number from 1 to 100
           Attempts=0;
        }
        else
        {
          break; // to exit from current statement.
        }

      }
      

    }

    System.out.println("Thank you for playing the 'Number Guessing Game' :) ");


  }
}