import java.util.Random;
public class rando{
  public static void main(String[] args){


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
        }
}
