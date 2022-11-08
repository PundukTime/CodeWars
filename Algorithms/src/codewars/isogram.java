package codewars;

public class isogram {
    public static void main(String[] args) {
        String iso = "sdasdasdawewedfssgsgsgdsgdsggdsgdsgdsgsgsgsgdsgdsgdsgdsgsds";

        System.out.println(isogram(iso));


    }

    static boolean isogram(String isogram) {

        if (isogram == "") {
            return true;
        }

        char[] chars = isogram.toLowerCase().toCharArray();

        boolean answer = true;
        for (int i = 0; i < chars.length - 2; i++)
            if (chars[i] == chars[i + 1] || chars[i] == chars[i + 2]) {

                answer = false;
            }
        return answer;
    }
}