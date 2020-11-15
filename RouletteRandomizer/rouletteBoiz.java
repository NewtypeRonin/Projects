//Roulette randomizer idea project
//This is going to be the skeleton for a randomizer for my characters daily roulettes in ffxiv
import java.util.Random;


//what we will need -
/* A Job class/object
   A duty class/object
   A method to store info about a user
   A random number generator
   */

   //Main method
public class rouletteBoiz
{
   public static void main(String[] args)
    {
      System.out.println("Greetings adventurer. Please let us know your Job, and Level");
      job jTester = new job("Samurai","DPS",80);
      //place holder for user input, should be assumed that they will only be using one class
      //job jTester = new job();
      //ask for name - input1
      //create a conditional statement
      //if input1 = dps job, then type = DPs etc. etc.
      //ask for level -input2
      System.out.println("I see that you are a " + jTester.getName() + " at level " + jTester.getLevel() + "!");

      System.out.println("What roulettes have you run today so far?");
      //create a loop or a sequential that asks
      //"Any other roulettes already done?"
      //if they say yes, accept input if not, close loop
      //while(more roulettes = true then loop: more roulettes = false close loop)

      //accept input here for duties that have been run
      //probably use an arraylist to hold duties that can be run or have been run.
      //use a for each loop to walk through set duties.

      System.out.println("Based on your answer we think you should run: " + "[Placeholder for duty to be run]" + "!");

      System.out.println("Would you like to run this one or try again? :) ");
      //accept user input for try again or end the randomizer loop
      //find some way to keep track of daily roulettes run so they don't have to input them each time
      //from there we find some kind of way to drop the stored data for the day at daily reset based on server time

      //potentially we could have a profile set up to where it saves their known classes and calculate average load times based on job type

    }
 }

   //constructor for Job
   //Constructor for duty
   //Initiate RNG

   //call to array of user's info

   //calculation/random roll

   //output

   //store data

   //end method
