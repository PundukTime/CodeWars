package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortINT {
    public static void main(String[] args) {
        int num1 = 42145;
        System.out.println(sortDesc(num1));
    }



    public static int sortDesc(final int num) {

        String str = Integer.toString(num);
        String[]numb=str.split("");
        int numArr[] = new int[numb.length];

        for (int i = 0; i < numb.length; i++){
            numArr[i] = Integer.parseInt(numb[i]);
        }
        Arrays.sort(numArr);

        String rev = Arrays.toString(numArr);
        char[] chars = rev.toCharArray();

        String result ="";
        for (int i = chars.length-1; i >= 0; i--) {
            result += Character.toString(chars[i]);
        }

        result = result.replaceAll("\\W","");

        int resultfin = Integer.parseInt(result);

        return resultfin;

        }




    }



