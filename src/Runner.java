// To do:
// write computer's make move function
// add colors
// check for diagonal wins

import java.util.Scanner;

public class Runner {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Computer comp = new Computer("Computer");
        System.out.println("What is your name?");
        Human human = new Human(sc.next());
        Board board = new Board();
        System.out.println("Hello " + human.name + ", this is the current board: ");
        board.printBoard();
        System.out.println("0 represents an open space, 1 is your piece, 2 is the computer's piece.");
        System.out.println("Note that diagonal wins do not count.");
        //switch to colors later

    // while no one has won yet:
//        while(board.determineWin()==false){
            // ask where to put the player's piece
            // place the piece
            // show the board
            // let the computer take a turn
            // show the board

            if(count%2==0){
                System.out.println("Where would you like to place your next piece? (column 1, 2, 3, 4, 5, 6, 7, or 8?)");
                int x = sc.nextInt()-1;
                // 1 = player, 2 = computer
                board.placePiece(x, 1);
                System.out.println("This is the current board:");
                board.printBoard();
                count += 1;

            }else{
//                System.out.println("The computer will now take a turn.");
//                comp.determineMove();
                count += 1;
            }
//        }

        // say who won
//        int w = board.getWin();
//        if(w == 1){
//            System.out.println("Congrats! You won!");
//        }else {
//            System.out.println("You lost :(");
//        }
    }
}



