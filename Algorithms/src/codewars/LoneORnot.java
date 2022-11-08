package codewars;

public class LoneORnot {
    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(24));
    }

    public static String howMuchILoveYou(int nb_petals) {

        String[] love = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        String result = "";
        if (nb_petals == 1)
            return result = love[0];

        int r1 = 0;
        if (nb_petals > 6) {
            if (nb_petals % 6 == 0) {
                return result = love[5];
            } else {
                r1 = nb_petals % 6 - 1;
                if (r1 == -1)
                    return result = love[0];
            }
        }

        if (nb_petals <= 6)

            r1 = nb_petals - 1;

        return result = love[r1];
    }
}

