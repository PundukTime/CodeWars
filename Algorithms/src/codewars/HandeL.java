package codewars;

import java.util.Arrays;

public class HandeL {

    public static void main(String[] args) {
        String num = "1 2 -3 4 5";
        System.out.println(highAndLow(num));
    }



    public static String highAndLow(String numbers) {
        // Codesaffdfdsfdsfhthtsfdsfsdsssffsfs
        String[]numb=numbers.split("\s");
        int numArr[] = new int[numb.length];

        for (int i = 0; i < numb.length; i++){
            numArr[i] = Integer.parseInt(numb[i]);
        }
        Arrays.sort(numArr);

        int one = numArr[0];
        int two = numArr[numArr.length-1];

        String result = two + " " + one;


        return result;
    }



}
