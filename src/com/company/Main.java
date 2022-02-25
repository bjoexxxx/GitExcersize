package com.company;

import java.util.Scanner;

public class Main {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        action.Goddag();
        action.askAboutAge();
        System.out.println("it works!");
    }
    public void Goddag(){
        System.out.println("intast navn");
        String navn = keyboard.nextLine();
        System.out.println(navn);
        System.out.println("hej "+navn);
    }
    public void askAboutAge(){
        System.out.println("indtast alder");
        int alder = keyboard.nextInt();
        System.out.println(alder);
    }
}
