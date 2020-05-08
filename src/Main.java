package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        long amount, value = 1000, percent = 100, balans = 100;
        System.out.print("Enter amount num: ");
        amount = num.nextInt();

        if (amount < value){ // True
            System.out.print(amount + balans);
        }else{
            System.out.print(amount + (amount / percent) + balans);
        }
    }
}
