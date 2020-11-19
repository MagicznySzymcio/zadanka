package zadania;

import java.util.Random;

public class Zgadywanie {
    static Random random = new Random();
    static final int zakres = 100;
    static int liczba = random.nextInt(zakres);
    static int max_liczba = 100;
    static int min_liczba = 0;



    public static void main(String[] args){
        System.out.println(liczba);
        Zgaduj(liczba);

    }

    static void Zgaduj(int losowanie) {
            int srednia = (min_liczba+max_liczba)/2;

            if (losowanie  == srednia) {
                System.out.println("");
                System.out.println("Czy liczba to " + srednia + "?");
                System.out.println("");
                System.out.println("Liczba jest równa " + srednia);
            } else if (losowanie < srednia) {
                System.out.println("");
                System.out.println("Czy liczba to " + srednia + "?");
                System.out.println("");
                System.out.println("Liczba jest mniejsza od " + srednia);
                max_liczba = srednia - 1;
                Zgaduj(losowanie);
            } else {
                System.out.println("");
                System.out.println("Czy liczba to " + srednia / 2 + "?");
                System.out.println("");
                System.out.println("Liczba jest większa od " + srednia / 2);
                min_liczba = srednia + 1;
                Zgaduj(losowanie);
            }
    }
}
