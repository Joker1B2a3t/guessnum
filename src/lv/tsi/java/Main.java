package lv.tsi.java;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int myNum = rand.nextInt(100) + 1;
        System.out.println(myNum);
        String answer;
        do {
            boolean userLost = true;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Try #" + i);
                int userNum = scan.nextInt();
                if (userNum == myNum) {
                    System.out.println("true");
                    userLost = false;
                    break;
                } else {
                    System.out.println("wrong");
                }
            }
            if (userLost == true) {
                System.out.println("You lost, my friend!");
            }

            System.out.println("Do you want to play again? (y/n)");
            answer = askYN();
        } while (answer.equals("y"));
        System.out.println("Good bye!");
    }


    static String askYN() {
        String answer;
        do {
            answer = scan.next();
            if (!answer.equals("y") && !answer.equals("n")) {
                System.out.println("You can enter 'y' or 'n' only!");
                continue;
            } else {
                return answer;
            }
        } while (true);
    }

    static int askNum() {
        String answer;
        do {
            try {
                answer = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println( "This isn't a number!");
            scan.next();
                continue;

        }
            answer = scan.nextInt();
            if (answer <= 100 && answer >= 0) {
                System.out.println("You can enter a number between 1 or 100");
                continue;
            } else {
                return answer;

            } while (true);
    }