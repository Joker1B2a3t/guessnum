package lv.tsi.java;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int myNum = rand.nextInt(100) + 1;
        System.out.println(myNum);

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

    }   // write your code here5
}


