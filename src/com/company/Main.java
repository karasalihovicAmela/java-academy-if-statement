package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value1 = 6;
        int value2 = 3;
        if (value1 < value2 || value1 == 3){
            System.out.println("Vrijednost 2 je veća od vrijednosti 1");
        }

        if (value1 < value2) {
            System.out.println("Value2 je veći");
            if (value1 == 3) {
                System.out.println("Value1 ima vrijednost " + value1);
            }
        }

        if (value2 > value1) {
            System.out.println("Value2 je veći");
        } else {
            System.out.println("Value1 je veći");
        }

        if (value2 == 2) {
            System.out.println("Value2 je 2");
        } else if (value1 == 3) {
            System.out.println("Value1 je 3");
        } else if (value2 == 4) {
            System.out.println("Value2 je 3");
        } else {
            System.out.println("Vrijednosti nisu tačne");
        }

        String value = value1 == value2 ? "Value1 je veći" :
                "Value2 je veći";
        System.out.println(value);

        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();

        System.out.println(int1);
        scanner.nextLine();
        System.out.println("Unesite string: ");
        String string1 = scanner.nextLine();

        System.out.println(string1);

        //Zadatak
        System.out.println("Unesite tri broja od 0 do 10 ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int num3 = scanner.nextInt();

        System.out.println("Vasi brojevi su: " + num1 + ",  " + num2 + ", " + num3);
        if (num1 > num2 && num1 > num3) {
            System.out.println("Najveci broj je: " + num1);
        } else if (num1 < num2 && num3 < num2) {
            System.out.println("Najveci broj je:" + num2);
        } else if (num1 < num3 && num2 < num3) {
            System.out.println("Najveci broj je: " + num3);
        }
        int zbir = Math.addExact(Math.addExact(num1, num2), num3);
        int prosjek = Math.round(zbir / 3);
        if (prosjek % 2 == 0){
            int sum = num1 + num2 + num3;
            System.out.println("Suma brojeva je jednaka " + sum);
        } else {
            System.out.println(Math.multiplyExact(Math.multiplyExact(num1, num2), num3));
        }

        System.out.print("Unesite jedan string: ");
        String stringText = scanner.next();

        if (Character.isUpperCase(stringText.charAt(0))) {
            System.out.println(stringText.toUpperCase());
        } else {
            System.out.println(stringText.toLowerCase());
        }

        String string = stringText.length() > 10 ? stringText : String.valueOf(stringText.length());
        System.out.println(string);
    }
}
