
package oct11_2017_inheritance;

import java.util.Scanner;


public class Week3_Homework_GuessingGame {
    public static void main(String[] args) {
        double start,end;
        boolean loop1=true;
        double n;
        Scanner sc=new Scanner(System.in);
        int result,output;
        while(loop1)
        {
        System.out.println("ENTER THE RANGES(FROM-TILL)");
        start=sc.nextDouble();
        end=sc.nextDouble();
        GuessingGame g=new GuessingGame(start,end);
        double randomnumber=g.game();
        boolean loop2=true;
        int c=0;
        while(loop2)
        {
            
        System.out.println("ENTER YOUR GUESS");
        n=sc.nextDouble();
        output=g.returnGuess(randomnumber,n);
        c++;
        if(output==1)
        {
            System.out.println("YOU GUESSED RIGHT");
            loop2=false;
            break;
        }
        else if(output==2)
                System.out.println("YOUR GUESS IS LESSER THAN THE RANDOM NUMBER");
            else
                System.out.println("YOUR GUESS IS GREATER THAN THE GIVEN NUMBER");
        }
            System.out.println("NUMBER OF GUESSES IN THE CURRENT GAME IS"+c);
        sc.nextLine();
            System.out.println("DO YOU WANT TO GUESS AGAIN WITH A NEW NUMBER");
            String choice=sc.nextLine();
            if(!choice.equalsIgnoreCase("y"))
            {
                loop1=false;
                System.out.println("TOTAL NUMBER OF GUESSES IN THE GAME IS"+g.no_game_guesses());
            }
        }
        System.out.println("NUMBER OF GAMES PLAYED IS"+GuessingGame.numberofGames());
        System.out.println("AVERAGE NUMBER OF GUESSES ARE"+GuessingGame.averageGuess());
        
    }
        
    
}
