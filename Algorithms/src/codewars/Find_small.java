package codewars;

import javax.print.attribute.standard.MediaTray;
import java.util.Arrays;

import static javax.print.attribute.standard.MediaTray.MIDDLE;

public class Find_small {
    public static void main(String[] args) {

        findSmallestInt();

        }


    static void findSmallestInt() {

        OUTER:
        for (int chas = 0; chas < 6 ; chas++) {
            MIDDLE:
            for (int minute = 0; minute <60 ; minute++) {
                if(chas>1 && minute %10 == 0){
                    break OUTER;
                }
                INNER:
                for (int sek = 0; sek < 60; sek++) {
                    if (sek*chas >minute) {
                        continue MIDDLE;

                    }
                    System.out.println(chas + " "+ minute + " " + sek );
                }
            }




        }

    }
}
