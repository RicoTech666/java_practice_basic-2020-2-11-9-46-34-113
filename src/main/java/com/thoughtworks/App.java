package com.thoughtworks;

import module.CardMachine;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CardMachine machine = new CardMachine();
        machine.drawCard(num);
    }
}
