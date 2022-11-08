package codewars;

public class CalculateAverage {

    public static void main(String[] args) {
       int [] array = {1,1,1};
        System.out.println(find_average(array));
    }

    public static double find_average(int[] array) {
        double sum = 0;
        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                sum+=array[i];
            }
            return sum / array.length;
        }
        else
            return 0;



    }
}
