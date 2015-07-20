/**
 * 
 */
package com.madan.java.training;

import java.util.Scanner;

/**
 * @author madan_000
 *
 */
public class TestDemo {
private static Scanner input;

public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.println("Enter your name");
	String name=input.nextLine();
	System.out.println(name);
	
}
}
