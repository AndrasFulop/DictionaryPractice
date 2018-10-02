package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// English to Spanish dictionary
        Map<String, String> engSpanDictionary = new HashMap<String, String>();
        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miércoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sábado");
        engSpanDictionary.put("Sunday", "Domingo");

    // Retrieve things from our dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        System.out.println(engSpanDictionary.get("Saturday"));
        System.out.println(engSpanDictionary.get("Sunday"));

    // Print out all the keys
        System.out.println(engSpanDictionary.keySet());

    // Print out all the values
        System.out.println(engSpanDictionary.values());

    // Print out the dictionary size
        System.out.println("The size of the dictionary is "+ engSpanDictionary.size());

        System.out.println();
        System.out.println();

    // Shopping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
    // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreos", false);
        shoppingList.put("Eggs", Boolean.TRUE);
        shoppingList.put("Sugar", Boolean.FALSE);

    // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));

    // Key - Value pairs print out
        System.out.println(shoppingList.toString());

    // Is empty?
        System.out.println(shoppingList.isEmpty());

    // Remove things from dictionary
        shoppingList.remove("Eggs");

    // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);

    // Clear out dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());

    }
}
