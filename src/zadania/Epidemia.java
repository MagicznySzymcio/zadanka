package zadania;

public class Epidemia {

    static int populacja = 100000;
    static int zarazeni = 10;
    static int zarazeni_pocz = 10;
    static int dzien = 0;
    static int count = 0;
    static int max = 0;
    static int maxint = Integer.MAX_VALUE;
    static int warunek = 0;

    public static void main(String[] args){

        while(zarazeni != 0){
                if(warunek == 0) {
                    zarazeni = zarazeni + zarazeni * 2;
                    dzien++;
                    if (dzien >= 6) {
                        zarazeni = zarazeni - zarazeni_pocz * 2 ^ count;
                        count++;
                    }
                    if(zarazeni >= populacja){
                        zarazeni = populacja;
                        warunek = 1;
                    }
                }else{
                    if (dzien >= 6) {
                        zarazeni = zarazeni - zarazeni_pocz * 2 ^ count;
                        count++;
                    }
                    dzien++;
                }
            System.out.println(dzien + " " + zarazeni);
        }
        System.out.println(zarazeni);

    }

}
