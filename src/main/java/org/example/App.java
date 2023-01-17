package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello There!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write two numbers:");
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println(add(a,b));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
