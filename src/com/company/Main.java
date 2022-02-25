package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        action.Greet();
        System.out.println("it works!");
    }
    public void Greet(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("intast navn");
        String navn = keyboard.nextLine();
        System.out.println(navn);
        System.out.println("hej "+navn);
    }
}
