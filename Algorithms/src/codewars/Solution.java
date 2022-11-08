package codewars;

public class Solution {

    public static void main(String[] args) {
        int [] sol = {17, 17, 3, 17, 17, 17, 17};

        System.out.println(stray(sol));


    }

    static int stray(int[] numbers) {
            int result =0;
        for (int i = 0; i < numbers.length-2; i++) {

            if(numbers[i]==numbers[i+2] && numbers[i]==numbers[i+1])

            result = numbers[i];

        }
            int result2= 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]!=result)
                result2 = numbers[i];

        }



        return result2;
    }


}
