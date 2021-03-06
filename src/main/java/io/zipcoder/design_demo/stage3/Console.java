package io.zipcoder.design_demo.stage3;

import java.util.Scanner;

/**
 * Created by leon on 9/4/17.
 */
public class Console {
    public void println(String val) {
        System.out.println(val);
    }

    public String getStringInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public Integer getIntegerInput(String prompt) {
        String inputString = getStringInput(prompt);
        int inputInt = Integer.parseInt(inputString);
        return inputInt;
    }
}
