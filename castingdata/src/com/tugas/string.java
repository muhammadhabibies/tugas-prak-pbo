package com.tugas;

public class string {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Habibie";
        String str3 = "";

        str3 = str1.concat(" " + str2 + ", ").concat("how are you?");

        System.out.println("String 3 : " + str3);
        System.out.println("Length : " + str1.length());
        System.out.println("Substring : " + str3.substring(0,8));
        System.out.println("Uppercase : " + str3.toUpperCase() + "\n");

        String str4 = "How are you " + str2 + "?";

        System.out.println("String 4 : " + str4);
        System.out.println("String : " + (str1 += str2));
        System.out.println("Index 'a' : " + str2.indexOf('a'));
        System.out.println("Index 2 : " + str2.charAt(2) + "\n");

        System.out.println("Str3 length : " + str3.length());
        System.out.println("Str4 length : " + str4.length());
        System.out.println("Compare : " + str3.compareTo(str4));
        System.out.println("Equals : " + str3.equals(str4));
    }
}
