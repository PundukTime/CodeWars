package codewars;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.util.Arrays.*;
import static java.util.Arrays.asList;

public class One_Two_One {
    public static void main(String[] args) {
        String iso2 = "cccccddddaaaa";
        String iso1 = "eeeeeevvvvcc";
        System.out.println(longest(iso1, iso2));


    }

    static String longest(String s1, String s2) {
        String charsum = s1 + s2;

        char[] chars = charsum.toLowerCase().toCharArray();
        Arrays.sort(chars);

        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }


        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);



            }

        String longest1 = sb.toString();
        return longest1;

    }

}

