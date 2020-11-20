package zadania;

public class Epidemia {

    static int populacja = 99990;
    static int zarazeni = 10;
    static int zarazeni_pocz = 10;
    static int dzien = 0;
    static int count = 0;

    public static void main(String[] args){

        while(zarazeni < populacja){
            zarazeni = zarazeni + zarazeni*2;
            dzien++;
            if(dzien == 6){
                zarazeni = zarazeni - zarazeni_pocz*2^count;
                count++;
            }
        }
        System.out.println(zarazeni);

    }

}
