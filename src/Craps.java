import java.util.Scanner;
import java.util.Random;

public class Craps {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rando = new Random();

        System.out.println("Welcome to Patience's Craps game!!");

        while (true) {
            int die1 = rando.nextInt(6) + 1;
            int die2 = rando.nextInt(6) + 1;
            int total = die1 + die2;
            int point = total;
            boolean gameOver = false;

            System.out.println("Press Enter to roll the dice.");
            in.nextLine();

            System.out.printf("You rolled: %d + %d = %d\n", die1, die2, total);

            if (total == 2 || total == 3 || total == 12)
            {
                System.out.println("Craps! You lose! :P");
            } else if (total == 7 || total == 11) {
                System.out.println("You're a natural! You win! :)");
            } else {
                System.out.printf("The point is now %d.\n", point);
                while (!gameOver) {
                    System.out.println("Press Enter to roll again.");
                    in.nextLine();
                    die1 = rando.nextInt(6) + 1;
                    die2 = rando.nextInt(6) + 1;
                    int newTotal = die1 + die2;
                    System.out.printf("You rolled: %d + %d = %d\n", die1, die2, newTotal);
                    if (newTotal == point)
                    {
                        System.out.println("Lucky duck! You made the point! You win! :))");
                        gameOver = true;
                    } else if (newTotal == 7)
                    {
                        System.out.println("Unlucky number 7! You lose!! :((");
                        gameOver = true;
                    }
                }

            }
            System.out.print("Do you want to play again? (Y/N): ");
            String choice = in.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for playing my game!");
                break;
            }

        }
        in.close();

        }
    }

