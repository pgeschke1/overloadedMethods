package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuSelection;
        do {
            System.out.println("Residential or Business Customer: ");
            System.out.println("1. Residential");
            System.out.println("2. Business");
            menuSelection = input.nextInt();
            if (menuSelection < 1 || menuSelection > 2){
                System.out.println("Please enter a valid selection: ");
            }
        }while (menuSelection != 1 && menuSelection != 2);
        switch (menuSelection){
            case 1:
                residential();
            case 2:
                business();
        }
    }
    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    private static void residential() {
        String name = getInput("Please enter your name: ");
        String number = getInput("Please enter your phone number: ");
        System.out.println(name);
        System.out.println(number);
    }
    private static void business() {
        String businessName = getInput("Please enter your business name");
        String name = getInput("Please enter your name: ");
        String number = getInput("Please enter your phone number: ");
        System.out.println(businessName);
        System.out.println(name);
        System.out.println(number);
    }
}
