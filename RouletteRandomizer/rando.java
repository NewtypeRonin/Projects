import java.util.Random;
public class rando{
  public static void main(String[] args){



    System.out.println("Greetings adventurer. Please let us know your Job, and Level");
    job jTester = new job("Samurai","DPS",80);

    System.out.println("I see that you are a " + jTester.getName() + " at level " + jTester.getLevel() + "!");

    System.out.println("What roulettes have you run today so far?");

          String welcome = "This is not an ukemi!";
          System.out.println(welcome);
          Random rand = new Random();
          int rouletteCap = 6;
          //
          int rouletteResult = rand.nextInt(rouletteCap);
          System.out.println(rouletteResult);

          switch(rouletteResult){
            case 1:
              System.out.println("Leveling roulette!");
              break;
            case 2:
              System.out.println("Trials!");
              break;
            case 3:
              System.out.println("MSQ~~~!!!");
              break;
            case 4:
              System.out.println("Alliance raids");
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

          System.out.println("Based on your answer we think you should run: " + "[Placeholder for duty to be run]" + "!");

          System.out.println("Would you like to run this one or try again? :) ");
        }
}
