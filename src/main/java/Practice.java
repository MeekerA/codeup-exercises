/**
 * Created by Austin on 12/12/16.
 */


import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.swapCase;

public class Practice {

    public static void main(String[] args) {
        String userInput;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a something. ");
        userInput = sc.nextLine();
        System.out.println("You entered: \"" + userInput + "\"");

        if (!isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is not a number.");
            System.out.println("Flipped Case: " + swapCase(userInput));
            System.out.println("Reversed: " + reverse(userInput));
        } else {
            System.out.println("\"" + userInput + "\" is a number.");
        }

    }
}

