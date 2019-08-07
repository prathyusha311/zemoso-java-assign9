package com.labs.zemoso;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTester {

    public static void main(String args[])
    {

        String input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input string:");
        input = sc.nextLine();
        System.out.println (Pattern.matches("[A-Z]+.*\\.", input)); //it matches regex with the given ip

    }
}
