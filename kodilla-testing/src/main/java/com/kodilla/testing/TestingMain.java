package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(10, 7);
        if (result1 == 8 && result2 == 3) {
            System.out.println("Test Calculator  - OK");
        } else {
            System.out.println("Test Calculator  - Error!");
        }

    }
}
