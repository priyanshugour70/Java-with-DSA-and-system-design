import java.util.*;


class Guesser {
    
    int guessNum ;

    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser ! Kindly guess the number ...");
        guessNum = sc.nextInt();
        return guessNum ;

    }
}

class Player {

    int guessNum ;

    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player ! Kindly guess the number ...");
        guessNum = sc.nextInt();
        return guessNum ;

    }
}

class Umpire {

    int numFromGuesser ;
    int numFromPlayer1 ;
    int numFromPlayer2 ;
    int numFromPlayer3 ;

    void collectNumFromGuesser(){
        Guesser g = new  Guesser() ;
        
        numFromGuesser = g.guessingNumber() ;
    }

    void collectNumFromPlayers(){
        Player p1 = new Player() ;
        Player p2 = new Player() ;
        Player p3 = new Player() ;

        numFromPlayer1 = p1.guessingNumber() ;
        numFromPlayer2 = p2.guessingNumber() ;
        numFromPlayer3 = p3.guessingNumber() ;
    }

    void Compare(){

        if(numFromGuesser == numFromPlayer1){

            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
                System.out.println("Sab ney sahi answer diya ! Sab winner hain bahi..");
            }else if(numFromGuesser == numFromPlayer2){
                System.out.println("Player 1 and Player 2 jeet gaye h...");
            }else if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 1 and Player 3 dono jeet gaye h..");
            }else{
                System.out.println("Player1 Won the Game...!");
            }

        } else if(numFromGuesser == numFromPlayer2){

            if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 2 and Player 3 dono jeet gaye h..");
            }else{
                System.out.println("Player2 Won the Game...!");
            }
            
        } else if(numFromGuesser == numFromPlayer3){
            System.out.println("Player3 Won the Game...!");
        }else{
            System.out.println("You Lost the Game .. ! No One Else Winner ....");
        }

    }
}


public class Guesser_Game {
    
    public static void main(String args[]){
        System.out.println("Game Started... ");

        Umpire U = new Umpire() ;

        U.collectNumFromGuesser();
        U.collectNumFromPlayers();
        U.Compare();
    }
}