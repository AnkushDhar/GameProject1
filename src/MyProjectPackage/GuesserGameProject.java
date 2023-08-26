package MyProjectPackage;

import java.util.Scanner;

class Guesser {
    int guesserNum;
    public int takeNumberGuesser () {
        System.out.print("Guesser guess a Number: ");
        Scanner sc = new Scanner(System.in);
        guesserNum = sc.nextInt();
        return guesserNum;
    }
}
class Player {
    int playerNum;
    public int takeNumberPlayer () {
        System.out.print("Player guess a Number: ");
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();
        return playerNum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectFromGuesser () {
        Guesser g = new Guesser();
        numFromGuesser = g.takeNumberGuesser();
    }
    void collectFromPlayer () {
        Player p1 = new Player();
        numFromPlayer1 = p1.takeNumberPlayer();

        Player p2 = new Player();
        numFromPlayer2 = p2.takeNumberPlayer();

        Player p3 = new Player();
        numFromPlayer3 = p3.takeNumberPlayer();
    }
    void compare () {
        if (numFromPlayer1 == numFromGuesser) {
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
                System.out.println("Winner: All");
            } else if (numFromPlayer2 == numFromGuesser) {
                System.out.println("Winner: Player 1, Player 2");
            } else if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Winner: Player 1, Player 3");
            } else {
                System.out.println("Winner: Player 1");
            }
        } else if (numFromPlayer2 == numFromGuesser) {
            if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Winner: Player 2, Player 3");
            } else {
                System.out.println("Winner: Player 2");
            }
        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Winner: Player 3");
        } else {
            System.out.println("Winner: No Player");
        }
    }
}
public class GuesserGameProject {
    public static void main(String[] args) {
        Umpire U = new Umpire();
        U.collectFromGuesser();
        U.collectFromPlayer();
        U.compare();
    }
}
