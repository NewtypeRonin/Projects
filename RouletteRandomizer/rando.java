import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class rando{
  public static void main(String[] args){



    //System.out.println("Greetings adventurer. Please let us know your Job, and Level");

    String ffJob;
    String jobType;
    int level;

    Scanner input = new Scanner(System.in);
    System.out.println("Greetings Warrior of Light, what job are you currently? ");
    ffJob = input.nextLine();
    //System.out.println("Please tell us your Job type: ");
    //jobType = input.nextLine();
    System.out.println("What level are you currently?");
    level = input.nextInt();

    job jTester = new job(ffJob, "", level);

    if((jTester.getName().equals("paladin"))||(jTester.getName().toLowerCase()=="warrior")||(jTester.getName().toLowerCase()=="gunbreaker")||jTester.getName().toLowerCase()=="dark knight")
    {
      jTester.setType("Tank");
    }
    System.out.println("Are you a " + jTester.getType() + "?");

    System.out.println("I see that you are a " + jTester.getName() + " at level " + jTester.getLevel() + "!");

    System.out.println("What roulettes have you run today so far?");
    //Code to be added to exclude certain options from the RNG
    //Most likely we would need to store data entry in an array
    //for now we'll declare it and go from there

    ArrayList<Integer> finishRoulettes = new ArrayList<Integer>();

    finishRoulettes.add(1);
    finishRoulettes.add(9001);
    for(int finish : finishRoulettes){
      System.out.println(finish);
    }

    Random rand = new Random();
    int rouletteCap = 6;
    int answer = 1;
    int rouletteResult;
    while(answer == 1)
    {
      rouletteResult = rand.nextInt(rouletteCap);
      System.out.println(rouletteResult);
      switch(rouletteResult){
        case 1:
          System.out.println("How about a Leveling roulette!");
          break;
        case 2:
          System.out.println("It's time for Trials!");
          break;
        case 3:
          System.out.println("Grab your popcorn it's MSQ time~~~!!!");
          break;
        case 4:
          System.out.println("For the Hord-- I mean uhhh...Alliance raids!");
          break;
        case 5:
          System.out.println("DESCENDING MISERY!");
          break;
        case 6:
          System.out.println("DESTINY CHASING TIME!");
          break;
        default:
          System.out.println("I AM THE STORM THAT IS APPROACHING!");
      }

    //System.out.println("Based on your answer we think you should run: " + "[Placeholder for duty to be run]" + "!");

      System.out.println("Would you like to run this one or try again? (1 for yes, 0 for no): ");

      answer = input.nextInt();

  }
 }
}
