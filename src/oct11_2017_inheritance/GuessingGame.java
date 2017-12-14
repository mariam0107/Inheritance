
package oct11_2017_inheritance;


public class GuessingGame {
private double start,end;
static int number_games=0;
static int count_guess_in_a_singlegame=0;
    public GuessingGame(double start,double end) {
        this.start=start;
        this.end=end;
        number_games++;
    }
    public  int returnGuess(double number,double n)
    {
        int c=0;
        count_guess_in_a_singlegame++;
        if(n==number)
         return 1;
     else
         if(n<number)
             return 2;
         else 
             return 3;
       
    }
       public static double averageGuess()
       {
           return (count_guess_in_a_singlegame/number_games);
       }
          public static int numberofGames()
          {
              return number_games;
          }
    public int no_game_guesses()
    {
        return count_guess_in_a_singlegame;
    }
    public int game()
    {
     int number=(int)(start+Math.random()*end);
     return number;
           
    }
    
}
