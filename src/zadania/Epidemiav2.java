package zadania;

public class Epidemiav2 {
    public static void main(String[] args) {
        System.out.println("epidemia skonczy sie po  " + wynik(10/2) + " dniach i tego dnia bedzie najwiecej chorych. ");

    }


    public static int wynik(int zakazeni) {

        int[] t = new int[100];
        int [] wynik = new int [100];

        int wyzdrowiali = 0, zdrowi = 0,pom=0;
        t[0] = zakazeni;
        for (int dzien = 1; (zdrowi + t[dzien - 1]) <= 100000; dzien++) {
            if (dzien < 8) {
                t[dzien] = t[dzien - 1] * 2;
                pom++;
            } else if (dzien >= 8) {
                wyzdrowiali = t[dzien - 7] - t[dzien - 8] - 5;
                zdrowi += wyzdrowiali;
                t[dzien] = (t[dzien - 1] - wyzdrowiali) * 2;
                pom++;
            }
            wynik[dzien]=dzien;
        }
        return  wynik[pom];
    }
}
