package com.kodluyoruz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        String pattern = "";
        String str = "";
        boolean exit = false;

        System.out.println("Enter the pattern string:");
        Scanner sc = new Scanner(System.in);
        pattern = sc.nextLine();


        while (!exit) {
            System.out.println("Enter a string:");
            str = sc.nextLine();
            if (!str.equals("exit")) {


                if (occursIn(pattern, str)) {
                    System.out.println(pattern + " occurs in " + str);
                } else {
                    System.out.println(pattern + " does not occur in " + str);
                }

            } else {
                exit = true;
            }
        }

        System.out.println("Bye!");

    }

    public static boolean occursIn(String pattern, String str) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        return m.matches();

    }
}

