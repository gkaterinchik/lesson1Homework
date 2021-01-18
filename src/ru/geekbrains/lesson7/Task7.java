package ru.geekbrains.lesson7;

public class Task7 {
    public static void main(String[] args) {
        setTestString("I like Java!!!");
        System.out.println(testString);
        System.out.println(testString.charAt(testString.length() - 1));
        System.out.println(testString.endsWith("!!!"));
        System.out.println(testString.startsWith("I like"));
        System.out.println(testString.contains("Java"));
        System.out.println(testString.indexOf("Java"));
        testString = testString.replace("a", "o");
        System.out.println(testString);
        testString = testString.toUpperCase();
        System.out.println(testString);
        testString = testString.toLowerCase();
        System.out.println(testString);
        testString = testString.substring(testString.indexOf("jovo"), 11);
        System.out.println(testString);

    }

    private static String testString;

    public static void setTestString(String str) {
        testString = str;
    }

}
