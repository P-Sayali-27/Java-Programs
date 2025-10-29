package Collections;

import java.util.ArrayList;
import java.util.List;
public class ArrayListFunctions {

    public static void main(String[] args) {
        //Creating a String List
        List<String> colors = new ArrayList<>();

        //1. Add() function
        colors.add("Black");
        colors.add("Pink");
        colors.add("White");
        colors.add("Red");
        colors.add("Grey");

        //Print list Elements
        System.out.println("Colours in List: " + colors);

        // 2. remove() function
        colors.remove(1);
        System.out.println("List after remove(): " + colors);

        // 3. size() function
        System.out.println("Size of the list: " + colors.size());

        // 4. contains() function
        boolean hasRed = colors.contains("Red");
        System.out.println("Contains Red? " + hasRed);

        // 5. addAll() - Add multiple elements from another list
        List<String> moreColours = new ArrayList<>();
        moreColours.add("green");
        moreColours.add("Blue");
        System.out.println("After adding more colours: " +moreColours);

        // 6. removeAll() function
        colors.removeAll(moreColours);
        System.out.println("After removeAll(moreColours): " + colors);

/*
        //  get() function
        String firstcolour = colors.get(0);
        System.out.println("First colors: " + firstcolour);

        //  set() - function
        colors.set(2, "Purple");
        System.out.println("Updated List after set(): " + colors);*/

    }
}