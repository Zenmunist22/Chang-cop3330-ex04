package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise04
{
    public static void main( String[] args )
    {
        String noun, verb, adjective, adverb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        noun = sc.nextLine();
        System.out.print("Enter a verb: ");
        verb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = sc.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = sc.nextLine();
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");


    }
}
