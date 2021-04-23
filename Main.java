package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш IP-address.");
        String input = in.nextLine();
        boolean result = input.matches("(((1[0-9][0-9])|(2[0-5][0-5]))\\.){3}((1[0-9][0-9])|(2[0-5][0-5]))");
        if (result) {
            System.out.println("Ваш IP-address правильный");
        } else {
            System.out.println("Ваш IP-address не правильный");
        }
    }
}