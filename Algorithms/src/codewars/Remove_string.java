package codewars;

import java.util.*;

public class Remove_string {
    public static void main(String[] args) {
        String remove = "person";




    }

    static String remove(String str) {

        char[] chars = str.toCharArray();

        String result ="";
        for (int i = 1; i < chars.length - 1; i++) {
            result += Character.toString(chars[i]);
        }


        return result;


    }
}


