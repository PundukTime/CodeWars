package codewars;

public class NumberFun {

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
    }

    public static long findNextSquare(long sq) {
           long sq1;
        if(Math.sqrt(sq) % 1 == 0) {
            sq1= (long) (Math.sqrt(sq)+1);
            sq1=sq1*sq1;

            return sq1;
        }
        else
            return -1;
    }
}
