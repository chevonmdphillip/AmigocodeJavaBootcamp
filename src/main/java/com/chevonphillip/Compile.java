/*
 * Copyright (c) 2023. Chevon Phillip
 */

package com.chevonphillip;

import java.util.Locale;

public class Compile {
    public static void main(String[] args) {
        int gradesForUser1 = 100;
        int gradesForUser2 = 90;
        int result = gradesForUser1 + gradesForUser2;

        String name = "chevon";
        String lastName = "phillip";

        System.out.printf("The result is %d%n", result);
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(lastName.substring(0, 1).toUpperCase(Locale.ROOT) + lastName.substring(1));

    }
}
