package com.github.cubixos.countries

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public static void main(String[] args) {

    // A list of fruits
    List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");
    // A fruit name to search for
    String fruitName = "banana";
    // Convert the fruit name to lower case
    fruitName = fruitName.toLowerCase();
    // Convert the list elements to lower case using the stream API
    List<String> lowerCaseFruits = fruits.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());
    // Check if the lower case list contains the lower case fruit name
    boolean found = lowerCaseFruits.contains(fruitName);
    // Print the result
    if (found) {
        System.out.println("The list contains " + fruitName);
    } else {
        System.out.println("The list does not contain " + fruitName);
    }



    public static boolean isEEACountry(String country) {
        String[] countries = {
                "Austria",
                "Belgium",
                "Bulgaria",
                "Croatia",
                "Cyprus",
                "Czech Republic",
                "Denmark",
                "Estonia",
                "Finland",
                "France",
                "Germany",
                "Greece",
                "Hungary",
                "Iceland",
                "Ireland",
                "Italy",
                "Latvia",
                "Liechtenstein",
                "Lithuania",
                "Luxembourg",
                "Malta",
                "Netherlands",
                "Norway",
                "Poland",
                "Portugal",
                "Romania",
                "Slovakia",
                "Slovenia",
                "Spain",
                "Sweden"
        };
        List<String> stringList = new ArrayList<>(Arrays.asList(countries));
        System.out.println(stringList.size());
        return stringList.contains(country);
    }

    public static boolean isEEACountryCode(String country) {
        String[] countriesLower = {
                "at",
                "be",
                "bg",
                "hr",
                "cy",
                "cz",
                "dn",
                "ee",
                "fi",
                "fr",
                "de",
                "gr",
                "hu",
                "is",
                "ie",
                "it",
                "lv",
                "li",
                "lt",
                "lu",
                "mt",
                "nl",
                "no",
                "pl",
                "pt",
                "ro",
                "sk",
                "si",
                "es",
                "se"
        };
        String[] countriesUpper = {
                "AT",
                "BE",
                "BG",
                "HR",
                "CY",
                "CZ",
                "DN",
                "EE",
                "FI",
                "FR",
                "DE",
                "GR",
                "HU",
                "IS",
                "IE",
                "IT",
                "LV",
                "LI",
                "LT",
                "LU",
                "MT",
                "NL",
                "NO",
                "PL",
                "PT",
                "RO",
                "SK",
                "SI",
                "ES",
                "SE"
        };
        List<String> stringListLower = new ArrayList<>(Arrays.asList(countriesLower));
        List<String> stringListUpper = new ArrayList<>(Arrays.asList(countriesUpper));

        System.out.println(stringListLower.size());
        System.out.println(stringListUpper.size());

        return stringListLower.contains(country) || stringListUpper.contains(country);
    }

}