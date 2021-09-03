package exercise04;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 Dustin Battles
 */

/*
 * In this one we need a few different strings so ill name them accordingly.
 * After asking for each one, store them
 * Come up with a predetermined sentence for the variables
 * Plug and chug those variables in a Systemout
 */

public class solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String noun, ptVerb, nounTwo, person, state;

        System.out.println("Welcome to Madlibs. Give us a noun!");
        noun = input.next();
        System.out.println("Nice, howsabout a verb in the past-tense?");
        ptVerb = input.next();
        System.out.println("Awesome. How about another noun?");
        nounTwo = input.next();
        System.out.println("Nice, now name your favorite person!");
        person = input.next();
        System.out.println("And for our final word, a state of being? Dead, alive, hungry, etc.");
        state = input.next();

        System.out.println("Here it is!");
        System.out.println("Dude, my " + noun + " just " + ptVerb + " my " + nounTwo + " and now " + person + " is " + state + "!");
    }
}
