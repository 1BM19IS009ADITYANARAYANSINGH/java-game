import java.util.*;
public class Main2 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter 1 for Tic Ttac Toe");
      System.out.println("Enter 2 for Snake ");
      System.out.println("Enter 3 for Guess The number");
      System.out.println("Enter 4 for Rock Paper Scissor");
      int a= sc.nextInt();
		switch(a)
      {    
      case 1: 
             TicTacToe tictactoe = new TicTacToe(); //instance of a class is created
            break;  
        case 2:
               new GameFrame();//instance of a class is created    
               break;
        case 3:
                 guessingNumberGame();//method is called
                  break;
        case 4:
             RockPaperScissors();//method is called
                 
                  break;
        default:     
                 System.out.println("wrong input");  
            }    
	}
    public  static void guessingNumberGame()
    {    
    
    
        
        Scanner asc = new Scanner(System.in);
  
        
        int number = 1 + (int)(100
                               * Math.random());
  
       
        int K = 5;
  
        int i, guess;
  
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");
  
        
        for (i = 1; i <=K; i++) {
  
            System.out.println("Guess the number:");
  
            
            guess = asc.nextInt();
  
            
            if (number == guess) {
                System.out.println("Congratulations!You guessed the number.");
                break;
            }
            else if (number > guess && i != K ) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != K) {
                System.out.println("The number is less than " + guess);
            }
        }
  
        if (i == K) {
            System.out.println("You have exhausted 5 trials.");
  
            System.out.println("The number was " + number);
        }
    }
  
  public static void RockPaperScissors()
   { 
    
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      String[] rps = {"rock", "paper", "scissor"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      
      String playerMove;
      
      while(true) {
        System.out.println("Please enter your move (rock, paper, or scissor)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      System.out.println("Computer played: " + computerMove);
      
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
      }
      else if (playerMove.equals("rock")) {
        if (computerMove.equals("paper")) {
          System.out.println("You lose!");
          
        } else if (computerMove.equals("scissor")) {
          System.out.println("You win!");
        }
      }
      
      else if (playerMove.equals("paper")) {
        if (computerMove.equals("rock")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("scissor")) {
          System.out.println("You lose!");
        }
      }
      
      else if (playerMove.equals("scissor")) {
        if (computerMove.equals("paper")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("rock")) {
          System.out.println("You lose!");
        }
      }
      
      System.out.println("Play again? (yes/no)");
      String playAgain = scanner.nextLine();
      
      if (!playAgain.equals("yes")) {
        break;
      }
    }
    scanner.close();
  }
}