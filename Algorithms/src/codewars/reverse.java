package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        System.out.println(solution("world"));

    }
    public static String solution(String str) {


        return new StringBuilder(str).reverse().toString();

    }
}
