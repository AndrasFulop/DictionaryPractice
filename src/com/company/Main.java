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
        engSpanDictionary.put("Thurday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sábado");
        engSpanDictionary.put("Sunday", "Domingo");

    // Retrieve things from our dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        System.out.println(engSpanDictionary.get("Saturday"));
        System.out.println(engSpanDictionary.get("Sunday"));
    }
}
