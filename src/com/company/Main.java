package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String message = "Hello how are you today i hope you are fine do you want" +
                " to do something today or do you just want to stay home and watch a movie " +
                " let me know if you want to go to the cinema " +
                "the new spider man movie is out and i have tickets";

        Pattern pattern = Pattern.compile("\\b([a-z]*[aeiouy][a-z]*){2,}\\b",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(message);

        while (matcher.find()) {

            System.out.println(matcher.group());


        }
    }
}
