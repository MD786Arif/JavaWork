import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int userNumber;

    public game() {
        Random rand = new Random();
        number = rand.nextInt(100);
    }
    public int getter(){
        return userNumber;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        userNumber = sc.nextInt();
    }

    public boolean isCorrectNumber() {

        if (userNumber == number) {
         return true;
        } else if (userNumber < number) {
            System.out.println("Number is too small");
        } else if (userNumber > number) {
            System.out.println("number is too large");
        }
        return false;
    }

}


public class GuessGame {
    public static void main(String[] args) {
        game g = new game();
    int count = 0;

      boolean b = false;
      while(!b){
          g.takeUserInput();
          b = g.isCorrectNumber();
          if(b==true){
              System.out.println("You won the match in "+count+" attempts");
          }
        count++;
      }


    }
}
/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
 */