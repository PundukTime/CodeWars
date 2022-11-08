package codewars;



public class Shortest_Word {
    public static void main(String[] args) {

        String remove = "bitcoin take over the world maybe who knows perhaps";


        System.out.println(findShort(remove));


    }

    public static int findShort(String s) {

        String[] words = s.split("\\s+");

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() < words[i - 1].length()) {
                    String temp = words[i];
                    words[i] = words[i - 1];
                    words[i - 1] = temp;
                    isSorted = false;


                }
            }



        }
        char[] result1 = words[0].toCharArray();

        int result = result1.length;
        return result;
    }

}







