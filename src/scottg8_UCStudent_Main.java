import java.util.Random;
import java.util.Scanner;

public class scottg8_UCStudent_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        do {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total value: " + sum);

            if(sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You've lost.");
            }
            else if(sum == 7 || sum == 11) {
                System.out.println("Natural! You've won.");
            }
            else {
                System.out.println("The point is now " + sum);
                int point = sum;

                while(true) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Rolling the dice again...");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Total value: " + sum);

                    if(sum == 7) {
                        System.out.println("Got a seven. You've lost.");
                        break;
                    }
                    else if(sum == point) {
                        System.out.println("Made point. You've won.");
                        break;
                    }
                    else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            System.out.println("Would you like to play again? (yes/no)");
            playAgain = sc.nextLine();

        } while(playAgain.equalsIgnoreCase("yes"));

        sc.close();
    }
}
