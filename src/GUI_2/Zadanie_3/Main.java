package GUI_2.Zadanie_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Spiewak s1 = new Spiewak("Dietrich"){

            @Override
            String spiewaj() {
                return "jbwichbucbw";
            }
        };

        Spiewak s2 = new Spiewak("Piaf"){

            @Override
            String spiewaj() {
                return "kvjnwonvcoiwnviow";
            }
        };

        Spiewak s3 = new Spiewak("Adele"){

            @Override
            String spiewaj() {
                return "noncqnpbncvbwifbbcwbcvuwncuncu9wn";
            }
        };

        Spiewak sp[] = {s2, s1, s3};

        for (Spiewak s : sp)
            System.out.println(s);

        System.out.println("======================================");
        System.out.println(Arrays.toString(sp));
        Arrays.sort(sp);
        System.out.println(Arrays.toString(sp));

      //  System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}
