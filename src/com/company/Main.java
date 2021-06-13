/*
 *  UCF COP3330 Summer 2021 Assignment 35 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        String name = null;
        ArrayList<String> names = new ArrayList<String>();
        do {
            System.out.println("Enter a name:");
            name= jb.nextLine();

            if(!name.isBlank() && !name.isEmpty())
                names.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        Random king = new Random();
        int randomIndex = king.nextInt(names.size());
        System.out.println("The winner is... "+names.get(randomIndex));
            }
        }
